import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000')

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_LOGIN ADMIN'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Kelola Akun'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Sub Admin Desa'))

WebUI.click(findTestObject('Page_Kelola Sub Admin Desa/button_Tambah Sub Admin'))

WebUI.setText(findTestObject('Page_Kelola Sub Admin Desa/input_Masukkan nama admin'), 'intan')

WebUI.setText(findTestObject('Page_Kelola Sub Admin Desa/input_contohemail.com'), 'intan@intan.com')

WebUI.setText(findTestObject('Page_Kelola Sub Admin Desa/input_08xxxxxxxxxx'), '085687122383')

WebUI.selectOptionByValue(findTestObject('Page_Kelola Sub Admin Desa/select_Kecamatan _'), '11', false)

WebUI.selectOptionByValue(findTestObject('Page_Kelola Sub Admin Desa/select_Desa _'), '156', false)

WebUI.setEncryptedText(findTestObject('Page_Kelola Sub Admin Desa/input_Minimal 8 karakter'), 'u654VbZQkqBSGu1jOstzHw==')

WebUI.click(findTestObject('Page_Kelola Sub Admin Desa/button_btnSubmit'))

