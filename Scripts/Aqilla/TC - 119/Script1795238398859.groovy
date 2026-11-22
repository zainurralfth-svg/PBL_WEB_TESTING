 /*
 * TC-119 - Login Gagal   (Anggota: Aqilla)
 * Cara pakai: Test Cases > New > Test Case (nama "TC-119"), tab Script, hapus isi bawaan
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

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), '')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'wTDG3a9a8NW4B5tUgD0iDg==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Tutup'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'petugas@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    '2Yt5kUTkPR7zlh6J+ZBO1g==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Tutup'))

