import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000/admin/login')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'))

WebUI.doubleClick(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_password-toggle'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Informasi TPS'))

WebUI.click(findTestObject('Page_Daftar TPS - RESIK/button_Tambah Info TPS'))

WebUI.click(findTestObject('Page_Tambah Informasi TPS - RESIK/span_Pilih di Maps'))

WebUI.switchToWindowTitle('Google Maps')

WebUI.setText(findTestObject('Page_Google Maps/input_Telusuri Google Maps'), 'tps werungo')

WebUI.click(findTestObject('Page_Google Maps/span_TPS Werungo'))

WebUI.switchToWindowTitle('Tambah Informasi TPS - RESIK')

WebUI.setText(findTestObject('Page_Tambah Informasi TPS - RESIK/textarea_textarea -7.601478,111.943225'), '-7.588114,111.9143531')

WebUI.setText(findTestObject('Page_Tambah Informasi TPS - RESIK/textarea_Contoh_ Jl. Merdeka No. 15, Kel. Beran,'), 'jalan gatot subroto')

WebUI.setText(findTestObject('Page_Tambah Informasi TPS - RESIK/input_Contoh_ 100'), '100')

WebUI.setText(findTestObject('Page_Tambah Informasi TPS - RESIK/input_Informasi tambahan'), 'werungotok')

WebUI.click(findTestObject('Page_Tambah Informasi TPS - RESIK/button_submitBtn'))

