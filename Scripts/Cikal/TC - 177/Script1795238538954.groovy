 /*
 * TC-097 - Tambah Edit Hapus Petugas   (Anggota: Cikal)
 * Cara pakai: Test Cases > New > Test Case (nama "TC-097"), tab Script, hapus isi bawaan
 * lalu tempel seluruh isi file ini. Jalankan web dulu (php artisan serve), ubah bagian PENGATURAN.
 */ import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_LOGIN ADMIN'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Kelola Akun'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Super Admin  Petugas'))

WebUI.click(findTestObject('Page_Kelola Akun - RESIK/button_Tambah Petugas'))

WebUI.click(findTestObject('Page_Kelola Akun - RESIK/div_modalPetugas'))

WebUI.setText(findTestObject('Page_Kelola Akun - RESIK/input_Masukkan nama petugas'), 'budi123')

WebUI.setText(findTestObject('Page_Kelola Akun - RESIK/input_contohemail.com'), 'budi@gmail.com')

WebUI.setText(findTestObject('Page_Kelola Akun - RESIK/input_08xxxxxxxxxx'), '082132384305')

WebUI.selectOptionByValue(findTestObject('Page_Kelola Akun - RESIK/select_Tipe Wilayah Kerja'), 'petugas_dlh', false)

WebUI.setEncryptedText(findTestObject('Page_Kelola Akun - RESIK/input_Masukkan Kata sandi'), 'ZfFNeBSuoqi4LUdtip/xBg==')

WebUI.click(findTestObject('Page_Kelola Akun - RESIK/button_btnSimpanPetugas'))

