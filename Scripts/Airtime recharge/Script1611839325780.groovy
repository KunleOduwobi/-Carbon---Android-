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
import io.appium.java_client.android.nativekey.AndroidKey as androidKey
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.windows.PressesKeyCode as PressesKeyCode
import io.appium.java_client.android.AndroidDriver as AndroidDriver

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.OPTIONAL)

try {
    if (Mobile.verifyElementExist(findTestObject('login/home/android.widget.TextView - Home'), 0, FailureHandling.OPTIONAL) == 
    true) {
        Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.ImageView'), 0)

        Mobile.setText(findTestObject('Object Repository/airtime recharge/android.widget.EditText - e.g 08031234567'), '07037857985', 
            0)

        Mobile.setText(findTestObject('Object Repository/airtime recharge/android.widget.EditText - 0.00'), '100', 0)

        Mobile.tap(findTestObject('airtime recharge/android.widget.ImageViewMTN'), 5)

        Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.Button - Next'), 0)

        Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.TextView - Available balance'), 0)

        Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.TextView - Confirm payment'), 0)

        Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.TextView - Securely pay  100.00'), 
            0)

        Mobile.delay(5)

        AndroidDriver<?> driver = MobileDriverFactory.getDriver()

        driver.pressKeyCode(8)

        driver.pressKeyCode(9)

        driver.pressKeyCode(10)

        driver.pressKeyCode(11)
    }
}
catch (Exception e) {
    println(e)
} 


Mobile.tap(findTestObject('Object Repository/airtime recharge/android.widget.TextView - Done'), 0)

Mobile.closeApplication()

