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

WebUI.click(findTestObject('Page_React App/span_testgroup2'))

WebUI.click(findTestObject('Object Repository/Group/Page_React App/button_Add Member'))

WebUI.click(findTestObject('Object Repository/Group/Page_React App/input_Invite friends totestgroup2_MuiInputB_d81c60'))

'Get Value attribute value of input'
attribute = WebUI.getAttribute(findTestObject('Object Repository/Group/Page_React App/input_Invite friends totestgroup2_MuiInputB_d81c60'), 
    'value')

WebUI.click(findTestObject('Object Repository/Group/Page_React App/button_Cancel'))

'Refresh the current web page'
WebUI.refresh()

WebUI.setText(findTestObject('Page_React App/input_Username_username'), username)

WebUI.setEncryptedText(findTestObject('Page_React App/input_Password_password'), 'CSt51UwWECc=')

WebUI.click(findTestObject('Page_React App/button_Sign in'))

WebUI.click(findTestObject('Page_React App/button_Okay'))

WebUI.click(findTestObject('Object Repository/Group/Page_React App/button_Add a Group'))

WebUI.setText(findTestObject('Object Repository/Group/Page_React App/input_create_MuiInputBase-input css-mnn31'), attribute)

//'Press Ctrl+V to Paste'
//WebUI.sendKeys(findTestObject('Object Repository/Group/Page_React App/input_create_MuiInputBase-input css-mnn31'), Keys.chord(
//        Keys.CONTROL, 'v'))
WebUI.click(findTestObject('Object Repository/Group/Page_React App/button_Go'))

WebUI.click(findTestObject('Object Repository/Group/Page_React App/h5_testgroup2'))

WebUI.verifyElementText(findTestObject('Object Repository/Group/Page_React App/h5_testgroup2'), 'testgroup2')

WebUI.closeBrowser()

