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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import io.appium.java_client.android.nativekey.AndroidKey as androidKey
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.windows.PressesKeyCode as PressesKeyCode
import io.appium.java_client.android.AndroidDriver as AndroidDriver

Mobile.startApplication('C:\\Users\\User\\Downloads\\carbon_ng-v6.7.1_signed.apk', true)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Activate/android.widget.TextView - Payments madeeasy'), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Object Repository/Activate/android.widget.Button - Skip'), 0)
}

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Activate/android.widget.Button - Sign In'), 90)

Mobile.setText(findTestObject('Object Repository/Activate/android.widget.EditText - Phone number'), '08990001100', 0)

Mobile.setText(findTestObject('Object Repository/Activate/android.widget.EditText - Enter PIN'), '1234', 0)

Mobile.tap(findTestObject('Object Repository/Activate/android.widget.Button - Sign in (1)'), 0)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Activate/android.widget.Button - Apply for a loan'), 0, 
    FailureHandling.OPTIONAL) == true) {
    KeywordUtil.markPassed('The app has been activated and has logged in')
} else {
    AndroidDriver<?> driver = MobileDriverFactory.getDriver()

    driver.pressKeyCode(8)

    driver.pressKeyCode(9)

    driver.pressKeyCode(10)

    driver.pressKeyCode(11)

    driver.pressKeyCode(12)

    driver.pressKeyCode(13)

    Mobile.delay(10)
}

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Activate/android.widget.TextView - Introducing Debit Cards'), 
    0, FailureHandling.OPTIONAL)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Activate/android.widget.TextView - Introducing Debit Cards'), 
    60, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Object Repository/Activate/android.widget.Button - Not right now'), 0)
}

Mobile.verifyElementVisible(findTestObject('Object Repository/Activate/android.widget.Button - Apply for a loan'), 0, FailureHandling.OPTIONAL)

