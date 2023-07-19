package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.Browser;
import base.ExtentReport;
import common.Common;
import common.Waits;
import pages.PhpTravels_DemoPage;

public class PhpTravels_DemoPage_Test {
	
	private Browser br = new Browser();
	private ExtentReport e = new ExtentReport("PhpTravels_DemoPage");
	private ExtentTest report;
	private WebDriver driver;
	private Common c = new Common();
	private Waits w;
	private PhpTravels_DemoPage pdp = new PhpTravels_DemoPage();
	private String statusPassDetails, statusFailDetails, imgName;
	
	@Test
	private void verifyDemoPageFields() throws Exception {
		report = e.createTest("Verify Demo Page fields", "To check whether Demo page contains 'First Name', 'Last Name', 'Business Name' and 'Email' text input fields.");
		w.elementClickable(pdp.homePage_DemoOption);
		c.click(driver, pdp.homePage_DemoOption);
		e.testInfo(report, "Clicked on Demo option");
		w.visibilityOfElement(pdp.demoPage_EMailField);
		boolean result;
		result = c.getAttributeValue(driver, pdp.demoPage_FNameField, "placeholder").equals("First Name");
		result &= c.getAttributeValue(driver, pdp.demoPage_LNameField, "placeholder").equals("Last Name");
		result &= c.getAttributeValue(driver, pdp.demoPage_BusinessNameField, "placeholder").equals("Business Name");
		result &= c.getAttributeValue(driver, pdp.demoPage_EMailField, "placeholder").equals("Email_");
		System.out.println(result);
		statusPassDetails = "Demo page verified successfully";
		statusFailDetails = "Failed to open Demo page";
		imgName = "DemoPage";
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
//			System.out.println("Test Skipped");
//	}
	
	@BeforeTest
	private void beforeTest() throws Exception {
		report = e.createTest("Verify Open Browser");
		driver = br.openBrowser(".//src//main//resources//Properties//PHPtravels.properties");
		w = new Waits(driver, 30);
		boolean result = driver != null;
//		if(result) {
//			e.testInfo(report, "Browser Opened");
//			e.testPass(report, "Browser opened successfully");
//			
//		}else {
//			e.testInfo(report, "Browser not Opened");
//			e.testfailScreenshot(driver, report, "OpenBrowser", "Failed to open Browser");
//		}
//		assertTrue(result, "Failed to open Browser");
		e.logResults(result, driver, report, "OpenBrowser", "Browser opened successfully", "Failed to open Browser");
	}
	
	@AfterTest
	private void afterTest() throws Exception {
		report = e.createTest("Verify Close Browser");
		driver = br.closeAllWindows(driver);
		boolean result = driver.toString().contains("null");
//		System.out.println(result);
//		if(result) {
//			e.testInfo(report, "Browser closed");
//			e.testPass(report, "Browser closed successfully");
//		}else {
//			e.testInfo(report, "Browser not closed");
//			e.testfailScreenshot(driver, report, "CloseBrowser", "Failed to close Browser");
//		}
		e.logResults(result, driver, report, "CloseBrowser", "Browser closed successfully", "Failed to close Browser");
		e.flush();
	}
	
}
