/*
 * TC-120 - Hak Akses Sub Admin   (Anggota: Aqilla)
 *
 * Langkah 1: Login sebagai Sub Admin Desa
 *   Expected: Masuk Dashboard Sub Admin Desa; menu Kelola Akun tidak tampil.
 * Langkah 2: Ketik URL halaman Kelola Akun / Sub Admin langsung pada browser
 *   Expected: Akses ditolak (redirect / halaman tidak diizinkan), data tidak ditampilkan.
 *
 * Cara pakai: tempel seluruh isi file ini ke Test Case "TC-120" (tab Script), hapus isi lama.
 */
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// ================== PENGATURAN ==================
String BASE_URL = 'http://127.0.0.1:8000'
// URL halaman Kelola Akun / Sub Admin yang TIDAK boleh dibuka Sub Admin Desa.
// Tambahkan URL lain bila ada (mis. halaman kelola sub admin).
List<String> URL_TERLARANG = ['/admin/sub-admin/akun']

String P = 'Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/'

// ================== PENCATAT TEMUAN ==================
List<String> temuan = []

// ================== HELPER ==================
def js = { String script ->
	return WebUI.executeJavaScript(script, null)
}
def foto = { String nama ->
	try {
		String dir = RunConfiguration.getProjectDir() + '/Screenshots'
		new File(dir).mkdirs()
		String file = dir + '/TC120_' + nama.replaceAll('[^A-Za-z0-9]', '_') + '.png'
		WebUI.takeScreenshot(file)
		KeywordUtil.logInfo('Screenshot: ' + file)
	} catch (Exception e) {
		KeywordUtil.logInfo('Gagal menyimpan screenshot: ' + e.getMessage())
	}
}
def sumberHalaman = {
	return DriverFactory.getWebDriver().getPageSource().toLowerCase()
}
def catat = { String langkah, String masalah ->
	String m = langkah + ' -> ' + masalah
	temuan.add(m)
	KeywordUtil.logInfo('TEMUAN: ' + m)
}
// true bila ada menu/tautan "Kelola Akun" yang terlihat di halaman
def menuKelolaAkunTampil = {
	def v = js("""
		function terlihat(e) {
			var s = window.getComputedStyle(e);
			return s.display !== 'none' && s.visibility !== 'hidden' && e.offsetParent !== null;
		}
		var a = document.querySelectorAll("a[href*='/admin/akun']");
		for (var i = 0; i < a.length; i++) { if (terlihat(a[i])) return true; }
		var t = document.querySelectorAll('a, li, span, p');
		for (var j = 0; j < t.length; j++) {
			if (t[j].children.length === 0 && t[j].innerText.trim().toLowerCase() === 'kelola akun' && terlihat(t[j])) return true;
		}
		return false;
	""")
	return v == true
}
// jumlah baris data pada tabel di halaman
def jumlahBarisData = {
	def v = js("return document.querySelectorAll('table tbody tr').length;")
	return v == null ? 0 : Integer.parseInt(v.toString())
}

// ================== EKSEKUSI ==================
WebUI.openBrowser('')
WebUI.maximizeWindow()

try {
	// ---------- LANGKAH 1: Login sebagai Sub Admin Desa ----------
	KeywordUtil.logInfo('===== LANGKAH 1: Login Sub Admin Desa =====')
	WebUI.navigateToUrl(BASE_URL + '/')
	WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_LOGIN ADMIN'))
	WebUI.setText(findTestObject(P + 'input_Masukkan email Anda'), 'alfin@gmail.com')
	WebUI.setEncryptedText(findTestObject(P + 'input_Masukkan kata sandi'), 'FRYdL4iLKljQIwcGEVBRXg==')
	WebUI.click(findTestObject(P + 'button_Masuk'))
	WebUI.waitForPageLoad(10)
	WebUI.delay(2)
	foto('L1_setelah_login')

	String urlSetelahLogin = WebUI.getUrl()
	KeywordUtil.logInfo('URL setelah login: ' + urlSetelahLogin)

	// Dashboard Sub Admin Desa: /admin/sub-admin/dashboard (Admin Super: /admin/dashboard)
	if (!urlSetelahLogin.contains('/dashboard') || urlSetelahLogin.contains('/login')) {
		catat('Langkah 1', 'Login Sub Admin Desa tidak masuk ke dashboard. URL: ' + urlSetelahLogin)
	} else {
		KeywordUtil.logInfo('OK: berhasil masuk dashboard Sub Admin Desa.')
	}

	if (menuKelolaAkunTampil()) {
		catat('Langkah 1', 'BUG: menu "Kelola Akun" TAMPIL untuk Sub Admin Desa, seharusnya tidak tampil.')
	} else {
		KeywordUtil.logInfo('OK: menu "Kelola Akun" tidak tampil.')
	}

	// ---------- LANGKAH 2: Ketik URL Kelola Akun langsung ----------
	for (String path : URL_TERLARANG) {
		KeywordUtil.logInfo('===== LANGKAH 2: Akses langsung ' + path + ' =====')
		WebUI.navigateToUrl(BASE_URL + path)
		WebUI.waitForPageLoad(10)
		WebUI.delay(2)
		foto('L2' + path)

		String url  = WebUI.getUrl()
		String html = sumberHalaman()
		boolean tetapDiHalaman = url.contains(path)
		boolean pesanTolak = html.contains('403') || html.contains('forbidden') || html.contains('unauthorized') ||
			html.contains('tidak diizinkan') || html.contains('tidak memiliki akses') || html.contains('akses ditolak') ||
			html.contains('tidak memiliki izin')
		int baris = jumlahBarisData()
		KeywordUtil.logInfo('URL akhir: ' + url + ' | pesan tolak: ' + pesanTolak + ' | baris tabel: ' + baris)

		if (tetapDiHalaman && !pesanTolak) {
			catat('Langkah 2', 'BUG: Sub Admin Desa DAPAT membuka ' + path + ' (tidak ada redirect/403). Baris data tampil: ' + baris)
		} else if (tetapDiHalaman && pesanTolak && baris > 0) {
			catat('Langkah 2', 'Ada pesan penolakan tetapi data tetap tampil di ' + path + ' (baris: ' + baris + ').')
		} else {
			KeywordUtil.logInfo('OK: akses ke ' + path + ' ditolak/dialihkan. URL akhir: ' + url)
		}
	}
} finally {
	WebUI.closeBrowser()
}

// ================== LAPORAN AKHIR ==================
if (temuan.isEmpty()) {
	KeywordUtil.markPassed('TC-120: hak akses Sub Admin Desa sesuai harapan.')
} else {
	KeywordUtil.markFailed('TC-120: ' + temuan.size() + ' temuan:\n- ' + temuan.join('\n- '))
}