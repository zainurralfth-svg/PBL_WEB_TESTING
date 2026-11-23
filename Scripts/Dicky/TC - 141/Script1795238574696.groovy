import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000')

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_LOGIN ADMIN'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'),
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/span_Artikel Edukasi'))

WebUI.click(findTestObject('Page_Daftar Artikel - RESIK/a_Tambah Artikel'))

File imageFile = new File(RunConfiguration.getProjectDir(), 'Screenshots/TC120_L1_setelah_login.png')
if (!imageFile.isFile()) {
    throw new IllegalStateException("Upload test image does not exist: ${imageFile.absolutePath}")
}

// Make the hidden input interactable without opening the native file chooser.
WebUI.executeJavaScript("document.getElementById('fotoInput').style.display = 'block';", null)
try {
    WebUI.uploadFile(findTestObject('Page_Tambah Artikel/input_fotoInput'), imageFile.absolutePath)
    Object hasSelectedImage = WebUI.executeJavaScript(
        "return document.getElementById('fotoInput').files.length > 0;", null)
    if (hasSelectedImage != Boolean.TRUE) {
        throw new IllegalStateException("Katalon did not attach the test image to fotoInput.")
    }
} finally {
    WebUI.executeJavaScript("document.getElementById('fotoInput').style.display = 'none';", null)
}

WebUI.setText(findTestObject('Page_Tambah Artikel/input_Masukkan judul artikel'), 'menenambahkan artikel')

WebUI.setText(findTestObject('Page_Tambah Artikel/textarea_Tulis konten artikel di sini'), 'hahahaha')

WebUI.click(findTestObject('Page_Tambah Artikel/button_submitBtn'))

