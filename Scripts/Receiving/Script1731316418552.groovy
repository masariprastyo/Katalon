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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Receiving/span_Container'))

WebUI.click(findTestObject('Receiving/span_Request Booking'))

WebUI.click(findTestObject('Receiving/span_Receiving'))

WebUI.click(findTestObject('Receiving/recCreate New'))

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/div_Vessel Information'), 'Vessel Information')

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Search Vessel'), 'Search Vessel *')

WebUI.setText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/input_searchVessel'), 'KAPAL')

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_Vessel'))

WebUI.scrollToElement(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_bookingLimitLeft'), 0)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_VIA'), 'VIA *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_TRUCK LOOSINGYARDTRANSHIPMENT'), 
    'YARD', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_POD'), 'POD *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_SGSIN - SINGAPOREIDBLW - BELAWAN, INDONESIAJPTYO - TOKYO, JAPANIDMAK - IDMAKIDJKT - JAKARTA, INDONESIAIDSUB - SURABAYA, INDONESIAIDAMQ - AMBON - Copy'), 
    'IDMAK - IDMAK', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_FPOD'), 'FPOD *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_SGSIN - SINGAPOREIDBLW - BELAWAN, INDONESIAJPTYO - TOKYO, JAPANIDMAK - IDMAKIDJKT - JAKARTA, INDONESIAIDSUB - SURABAYA, INDONESIAIDAMQ - AMBON'), 
    'IDMAK - IDMAK', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Trade Type'), 'Trade Type *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_INTERSULEROCEAN GOING'), 'INTERSULER', 
    false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Customer Name'), 'Customer Name *')

WebUI.setText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/input__customerName'), 'MERPATI')

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_Customer'))

WebUI.scrollToElement(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Customer Name'), 0)

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/button_Save Data Header'))

WebUI.delay(5)

String copiedText = WebUI.getText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_idREQ'))

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_DetailContainer'), 'Detail Container')

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Container No'), 'Container No *')

WebUI.setText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/input__containerNo'), 'AUTO0000011')

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/button_Bypass'))

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Size'), 'Size *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_Size'), '20', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Type'), 'Type *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_DRYFLTUCHQOTTNKRFR'), 'DRY', 
    false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Status'), 'Status *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_FULLEMPTY'), 'FULL', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Height'), 'Height *')

WebUI.verifyNotEqual(WebUI.getAttribute(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_Height'), 'value').equals(
        null), '', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Weight'), 'Weight *')

WebUI.setText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/input__weight'), '15000')

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Hazard'), 'Hazard *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_HZNoYes'), 'No', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Commodity'), 'Commodity *')

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/button_Eye'))

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/td_PC0001'))

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/button_Yes'))

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Carrier'), 'Carrier *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select__carrierCode'), 'MRT - MERATUS LINE', 
    false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_ISO Code'), 'ISO Code *')

WebUI.verifyNotEqual(WebUI.getAttribute(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_ISO Code'), 'value').equals(
        null), '', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Seal Number'), 'Seal Number')

WebUI.setText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/input_Seal Number_sealNumber'), 'INISEAL')

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Sling'), 'Sling')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_SlingNoYes'), 'No', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Open Door(OD)'), 'Open Door(OD)')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_ODNoYes'), 'No', false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_OVDOOG'), 'OVD/OOG *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_OOGNoYes'), 'No', false)

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/button_Add Container'))

WebUI.scrollToElement(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_DetailContainer'), 0)

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/button_Save Preview'))

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/button_YesProforma'))

WebUI.scrollToElement(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/button_Approve'), 
    0)

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Page_PRAYAQA PRAYA SINGLE BILLING/button_Approve'))

WebUI.navigateToUrl('https://prayaqa.ilcs.co.id/bill-payment/display')

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/Checklist Bill Payment'))

WebUI.click(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/button_Pay'))

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_bankName'), 'Bank Name *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_bankName'), 'IPCTPK MANDIRI IDR 1200010015040', 
    false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_transferDate'), 'Bank Name *')

WebUI.selectOptionByLabel(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/select_transferDate'), '12/06/2024', 
    false)

WebUI.verifyElementText(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/label_Payment Slip'), 'Payment Slip (pdf/jpg/jpeg)')

String filePath = 'D:\\ILCS\\Praya\\Blank Document.pdf'

WebUI.uploadFile(findTestObject('Receiving/Page_PRAYAQA PRAYA SINGLE BILLING/upload_paymentslip'), filePath)

//WebUI.click(findTestObject('Object Repository/SubmitButton'))

