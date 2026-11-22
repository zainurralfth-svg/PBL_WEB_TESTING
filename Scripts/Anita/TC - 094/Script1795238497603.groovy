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

WebUI.navigateToUrl('http://127.0.0.1:8000/admin/data-pengguna?filter=all')

WebUI.setText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan email Anda'), 'dikalucky1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_password-toggle'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Data Pengguna'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'dinas', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_2'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'dinas', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnFilterWilayah'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_ASN _ PNS'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_Masyarakat'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '6', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_2_1'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '9', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_Perempuan'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '9', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_1'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterKecamatan'), '9', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDesa'), '142', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_btnResetWilayah'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_ASN _ PNS'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_Semua'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'dinas', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '12', false)

WebUI.verifyTextNotPresent('Masyarakat', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '14', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '33', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '11', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '15', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_Next'))

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_tipeFilter'), 'dinas', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '24', false)

WebUI.selectOptionByValue(findTestObject('Page_Data Pengguna - RESIK/select_filterDinasSelect'), '12', false)

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/main_Daftar Data Pengguna'))

