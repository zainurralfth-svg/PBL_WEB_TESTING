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

WebUI.navigateToUrl('http://127.0.0.1:8000')

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_BERANDA (5)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_TENTANG KAMI (5)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_FITUR (5)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_JENIS SAMPAH (5)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/button_Organik (4)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/button_Non Organik (5)'))

WebUI.click(findTestObject('Page_RESIK - Dinas Lingkungan Hidup Kabupaten Nganjuk/a_DOWNLOAD APK (5)'))

