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
WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_LOGIN ADMIN'))

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'))

WebUI.doubleClick(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'))

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_password-toggle'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Data Pengguna'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '6', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDesa'), '89', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnResetWilayah'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'dinas', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '24', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '12', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

//WebUI.click(findTestObject('Page_Data Pengguna - RESIK/div_Berdasarkan Wilayah'))//

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

//WebUI.click(findTestObject('Page_Data Pengguna - RESIK/div_Berdasarkan Wilayah'))//

//WebUI.click(findTestObject('Page_Data Pengguna - RESIK/div_Daftar Data Pengguna'))//

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'wilayah', false)

//WebUI.click(findTestObject('Page_Data Pengguna - RESIK/div_Daftar Data Pengguna'))//

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))
