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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://prayaqa.ilcs.co.id/login')

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/img_praya'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/2024 All Rights Reserved'), '@2024 All Rights Reserved')

WebUI.verifyElementText(findTestObject('Object Repository/Login/label_Username'), 'Username')

WebUI.setText(findTestObject('Login/input_Username'), '')

WebUI.setText(findTestObject('Login/input_Username'), '00000001')

WebUI.verifyElementText(findTestObject('Object Repository/Login/label_Password'), 'Password')

WebUI.setText(findTestObject('Login/input_Password'), '')

WebUI.setText(findTestObject('Login/input_Password'), 'Pray@123')

WebUI.click(findTestObject('Object Repository/Login/show_password'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/label_Captcha'), 'Captcha')

WebUI.setText(findTestObject('Login/input_Captcha'), '11111')

WebUI.click(findTestObject('Login/button_Sign In'))

WebUI.verifyElementVisible(findTestObject('Login/img_praya dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login/Dashboard'), 'Dashboard')

