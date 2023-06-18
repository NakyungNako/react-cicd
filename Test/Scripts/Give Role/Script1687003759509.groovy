import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://188.166.184.241/login')

WebUI.setText(findTestObject('Page_React App/input_Username_username'), 'account1')

WebUI.setEncryptedText(findTestObject('Page_React App/input_Password_password'), 'CSt51UwWECc=')

WebUI.click(findTestObject('Page_React App/button_Sign in'))

WebUI.click(findTestObject('Page_React App/button_Okay'))

WebUI.click(findTestObject('Page_React App/div_testgroup2'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/button_account2'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/li_Make Admin'))

WebUI.click(findTestObject('Page_React App/Page_React App/button_account3'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/li_Make Admin'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/p_admin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_React App/Page_React App/p_admin'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/p_admin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_React App/Page_React App/p_admin'), 'admin')

WebUI.closeBrowser()

