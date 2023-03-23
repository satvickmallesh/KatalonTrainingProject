import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {

	@Keyword(keywordObject ="SAT")
	def hello() {

		println("Hey Katalon");
	}
	
	@Keyword
	def login() {
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://uat-tsf.crm6.dynamics.com/')
		WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'satvick.mallesh@thesmithfamily.com.au')
		WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'ajWt3wiGSyFG1621BC1llQ==')
		WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))
	}
	
	@Keyword
	def heyUser(String user) {
		println "Hello " + user 
		
	}
}
