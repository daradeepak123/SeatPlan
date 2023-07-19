package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.Browser;
import base.ExtentReport;
import common.Common;
import common.Waits;
import common.WindowsHandling;
import pages.PhpTravels_SignUpPage;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PhpTravels_SignUpPage_Test {
	
	private Browser br = new Browser();
	private ExtentReport e = new ExtentReport("PhpTravels_SignUpPage");
	private WebDriver driver;
	private ExtentTest report;
	private Waits w;
	private PhpTravels_SignUpPage psp = new PhpTravels_SignUpPage();
	private Common c = new Common();
	private String statusPassDetails, statusFailDetails, imgName;
	
	@Test(priority = 1)
	private void verifySignUpPage() throws Exception {
		report = e.createTest("Verify SignUp Page", "To check whether Sign Up page contains sections like \"Personal Information\", \"Billing Address\", \"Additional Required Information\", \"Account Security\" and \"Join our mailing list\"");
		w.elementClickable(psp.homePage_SignUpButton);
		c.click(driver, psp.homePage_SignUpButton);
		e.testInfo(report, "Clicked on SignUp button");
		WindowsHandling wh = new WindowsHandling(driver);
		driver = wh.switchToWindow(driver);
		w.visibilityOfElement(psp.signUpPage_PersonalInfoSection);
		boolean result;
		result = c.getText(driver, psp.signUpPage_PersonalInfoSection).equals("Personal Information");
		result &= c.getText(driver, psp.signUpPage_BillingAddressSection).equals("Billing Address");
		result &= c.getText(driver, psp.signUpPage_AddInfoSection).equals("Additional Required Information");
		result &= c.getText(driver, psp.signUpPage_AccountSecuritySection).equals("Account Security");
		result &= c.getText(driver, psp.signUpPage_JoinMailListSection).equals("Join our mailing list");
		statusPassDetails = "SignUpPage verified successfully";
		statusFailDetails = "Failed to Verify SignUp page";
		imgName = "SignUpPage";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
//	@AfterMethod
//	private void afterMethod(ITestResult result) throws Exception {
//		if(result.getStatus() == ITestResult.SUCCESS)
//			e.testPass(report, statusPassDetails);
//		else if(result.getStatus() == ITestResult.FAILURE)
//			e.testfailScreenshot(driver, report, imgName, statusFailDetails);
//		else if(result.getStatus() == ITestResult.SKIP)
//			e.testSkip(report, "Test Skipped");
//	}
	
	@BeforeTest
	private void beforeTest() throws Exception {
		report = e.createTest("Verify Open Browser");
		driver = br.openBrowser(".//src//main//resources//Properties//PHPtravels.properties");
		boolean result = !driver.equals(null);
//		if(result) {
//			e.testInfo(report, "Browser opened");
//			e.testPass(report, "Browser opened seccessfully");
//		}else {
//			e.testInfo(report, "Browser not opened");
//			e.testfailScreenshot(driver, report, "OpenBrowser", "Failed to open browser");
//		}
//		assertTrue(result, "Failed to open browser");
		e.logResults(result, driver, report, "OpenBrowser", "Browser opened successfully", "Failed to open Browser");
		w = new Waits(driver, 30);
	}

	@AfterTest
	private void afterTest() throws Exception {
		report = e.createTest("Verify Close Browser");
		driver = br.closeAllWindows(driver);
		boolean result = driver.toString().contains("null");
//		if(result) {
//			e.testInfo(report, "Browser closed");
//			e.testPass(report, "Browser closed successfully");
//		}else {
//			e.testInfo(report, "Browser not closed");
//			e.testfailScreenshot(driver, report, "CloseBrowser", "Failed to Close Browser");
//		}
//		assertTrue(result, "Failed to Close Browser");
		e.logResults(result, driver, report, "CloseBrowser", "Browser closed successfully", "Failed to close Browser");
		e.flush();
	}

}
