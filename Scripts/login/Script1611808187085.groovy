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

Mobile.startExistingApplication('com.lenddo.mobile.paylater.staging', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if (Mobile.verifyElementExist(findTestObject('Object Repository/login/android.widget.Button - Sign In'), 0, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - Sign In'), 0)

    Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Phone number'), '08990001100', 0)

    Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Enter PIN'), '1234', 0)

    Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - Sign in (1)'), 0 //AndroidDriver<?> driver = MobileDriverFactory.getDriver()
        ) //Mobile.tap(findTestObject('Login PW/android.widget.FrameLayout'), 0)
} else if (Mobile.verifyElementVisible(findTestObject('Login PW/android.widget.passwordLine'), 5, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Login PW/android.widget.passwordLine'), 0)

    AndroidDriver<?> driver = MobileDriverFactory.getDriver()

    driver.pressKeyCode(8)

    driver.pressKeyCode(9)

    driver.pressKeyCode(10)

    driver.pressKeyCode(11)
} else if (Mobile.verifyElementVisible(findTestObject('Object Repository/login/android.widget.EditText - Phone number'), 
    0, FailureHandling.OPTIONAL) == true) {
    Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Phone number'), '08990001100', 0)

    Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Enter PIN'), '1234', 0)

    Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - Sign in (1)'), 0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/login/home/android.widget.TextView - Home'), 0)
} else {
    (Mobile.verifyElementExist(findTestObject('login/home/android.widget.TextView - Home'), 10, FailureHandling.OPTIONAL) == 
    true).call({ 
            KeywordUtil.markPassed('The test has passed')
        })
}

