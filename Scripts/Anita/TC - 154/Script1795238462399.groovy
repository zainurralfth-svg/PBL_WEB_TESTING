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

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'))

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_password-toggle'))

WebUI.setEncryptedText(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/input_Masukkan kata sandi'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - Dinas Lingkungan Hidup Kab. Nganjuk/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - RESIK/a_Data Pengguna'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_Farida Novalia'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_1'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_081234057231'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/span_Masyarakat (Kertosono, Pandantoyo)'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/i_fas fa-eye'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Detail'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/div_Nama Lengkap'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/label_Saldo Bank Sampah'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/span_modalSaldo'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Tutup'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/span_Prev'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_2'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/i_fas fa-eye_1'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Tutup'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_Next'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_ASN _ PNS'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_Lilis Maretnaningsih'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_maretna22gmail.com'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/span_Perempuan'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_082119556866'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/th_Pekerjaan'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/td_Rp 0'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/i_fas fa-eye_2'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Detail_1'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Tutup'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_Masyarakat'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Detail_2'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_Tutup'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/i_fas fa-eye_3'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/button_'))

WebUI.click(findTestObject('Page_Data Pengguna - RESIK/a_2_1'))

