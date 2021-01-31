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

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - Fund Wallet'), 0)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - Add money with a debit card'), 5)

if (Mobile.verifyElementVisible(findTestObject('Fund Wallet/android.widget.Button - Continue'), 5, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Fund Wallet/android.widget.Button - Continue'), 5)
}

Mobile.setText(findTestObject('Object Repository/Fund Wallet/android.widget.EditText - 0.00'), '1000', 0)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.Button - Proceed'), 5)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - 4084084081'), 0)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - Confirm payment'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Fund Wallet/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - Securely pay 1,010'), 0)

Mobile.delay(5)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(8)

driver.pressKeyCode(9)

driver.pressKeyCode(10)

driver.pressKeyCode(11)

Mobile.verifyElementVisible(findTestObject('Object Repository/Fund Wallet/android.widget.TextView - Wallet is not available to receive funds'), 
    0)

Mobile.tap(findTestObject('Object Repository/Fund Wallet/android.widget.Button - OK'), 0)

Mobile.pressBack()

Mobile.pressBack()

