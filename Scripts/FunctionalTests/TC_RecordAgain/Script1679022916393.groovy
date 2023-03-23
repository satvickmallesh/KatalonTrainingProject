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

WebUI.navigateToUrl('https://login.microsoftonline.com/6a1de9dc-cbe2-4c9f-82aa-4f7dd7af6477/oauth2/authorize?client_id=00000007-0000-0000-c000-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid+profile&state=OpenIdConnect.AuthenticationProperties%3dMAAAAID3jxWu4xHtmoQAIkgRC0MYdkcqYf8BNIVLUaquIOGx7-FyiE8_1u1XDRndZVwhKAEAAAABAAAACS5yZWRpcmVjdCJodHRwczovL3VhdC10c2YuY3JtNi5keW5hbWljcy5jb20v%26RedirectTo%3dMAAAAID3jxWu4xHtmoQAIkgRC0OnxBgnrIPW0E2FJRUnlTBxQkYIdQzFNok%252bxMRijKiv0mh0dHBzOi8vdWF0LXRzZi5jcm02LmR5bmFtaWNzLmNvbS8%253d%26RedirectToForMcas%3dhttps%253a%252f%252fuat-tsf.crm6.dynamics.com%252f&nonce=638146197360454980.MDI1ZjIwODQtNmRhZS00ODMxLWJlYTUtODIyMTJkMTdhMWU1YzVlMTg2YTctMWUzOS00YmM0LWExYmEtNWFkMTU3MmZhNWMz&redirect_uri=https%3a%2f%2fmel--ocecrmlivesg611.crm6.dynamics.com%2f&max_age=86400')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'satvick.mallesh@thesmithfamily.com.au')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'ajWt3wiGSyFG1621BC1llQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Text XX XXXXXXXX00'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_concat(We, , ve texted your phone XX _528684'), 
    '645242')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_More information_idSubmit_SAOTCC_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

