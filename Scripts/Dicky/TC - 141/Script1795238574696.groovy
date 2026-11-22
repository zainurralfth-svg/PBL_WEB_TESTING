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

WebUI.navigateToUrl('http://127.0.0.1:8000/admin/login')

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')  

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Artikel Edukasi'))

WebUI.click(findTestObject('Page_Daftar Artikel - RESIK/a_Tambah Artikel'))

WebUI.click(findTestObject('Page_Tambah Artikel/div_uploadPlaceholder'))

WebUI.executeJavaScript("document.getElementById('fotoInput').style.display='block'", null)

WebUI.uploadFile(foto, 'C:/User/Lenovo/Screenshot\\Screenshot 2026-11-22 130635.png')

WebUI.setText(findTestObject('Page_Tambah Artikel/input_fotoInput'), 'C:/User/Lenovo/Screenshot\\Screenshot 2026-11-22 130635.png')

WebUI.setText(findTestObject('Page_Tambah Artikel/input_Masukkan judul artikel'), 'tes ')

WebUI.setText(findTestObject('Page_Tambah Artikel/textarea_Tulis konten artikel di sini'), 'testing')

WebUI.click(findTestObject('Page_Tambah Artikel/button_submitBtn'))

WebUI.closeBrowser()

