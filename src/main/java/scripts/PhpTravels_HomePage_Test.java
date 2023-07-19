package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.Browser;
import base.ExtentReport;
import common.Common;
import common.MouseActions;
import common.Waits;
import pages.PhpTravels_HomeAndPricingPage;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PhpTravels_HomePage_Test {
	
	private Browser br = new Browser();
	private ExtentReport e = new ExtentReport("PhpTravels_HomePage");
	private WebDriver driver;
	private ExtentTest report;
	private Waits w;
	private Common c = new Common();
	private PhpTravels_HomeAndPricingPage hpp = new PhpTravels_HomeAndPricingPage();
	private MouseActions a;
	private String statusPassDetails, statusFailDetails, imgName;
	
	@Test(priority=1)
	private void verifyHomePage() throws Exception {
		boolean result;
		report = e.createTest("Verify Home Page", "To check whether Home page is opened or not.");
		result = c.getTitle(driver).contains("PHPTRAVELS");
		result &= c.getText(driver, hpp.homePage_DemoOption).equalsIgnoreCase("demo");
		result &= c.getText(driver, hpp.homePage_PricingOption).equalsIgnoreCase("pricing");
		result &= c.getText(driver, hpp.homePage_FeaturesOption).equalsIgnoreCase("features");
		result &= c.getText(driver, hpp.homePage_IntegrationsOption).equalsIgnoreCase("integrations");
		result &= c.getText(driver, hpp.homePage_CompanyOption).equalsIgnoreCase("company");
		statusPassDetails = "HomePage verified successfully";
		statusFailDetails = "Failed to verify Homepage";
		imgName = "HomePage";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority=2)
	private void verifyFeaturesDropdown() throws Exception {
		report = e.createTest("Verify Features dropdown", "To check whether Features dropdown is working or not");
		c.click(driver, hpp.homePage_FeaturesOption);
		e.testInfo(report, "Clicked on Features option");
		boolean result;
		result = c.getText(driver, hpp.homePage_Features_MainFeatures).equals("Main Features");
		result &= c.getText(driver, hpp.homePage_Features_HotelsModule).equals("Hotels Module");
		result &= c.getText(driver, hpp.homePage_Features_FlightsModule).equals("Flights Module");
		result &= c.getText(driver, hpp.homePage_Features_ToursModule).equals("Tours Module");
		result &= c.getText(driver, hpp.homePage_Features_CarsModule).equals("Cars Module");
		result &= c.getText(driver, hpp.homePage_Features_OffersModule).equals("Offers Module");
		result &= c.getText(driver, hpp.homePage_Features_BlogModule).equals("Blog Module");
		result &= c.getText(driver, hpp.homePage_Features_NewsLetterModule).equals("Newsletter Module");
		result &= c.getText(driver, hpp.homePage_Features_CmsModule).equals("CMS Module");
		statusPassDetails = "Featires dropdown verified successfully";
		statusFailDetails = "Features options not found";
		imgName = "FeaturesDropdown";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority=3)
	private void verifyIntegrationsDropdown() throws Exception {
		report = e.createTest("Verify Integrations Dropdown", "To check whether Integrations dropdown is working or not");
		c.click(driver, hpp.homePage_IntegrationsOption);
		e.testInfo(report, "Clicked on Integrations option");
		boolean result;
		result = c.getText(driver, hpp.homePage_Integrations_Hotels).equals("Hotels");
		result &= c.getText(driver, hpp.homePage_Integrations_Flights).equals("Flights_");
		result &= c.getText(driver, hpp.homePage_Integrations_Tours).equals("Tours");
		result &= c.getText(driver, hpp.homePage_Integrations_Cars).equals("Cars");
		statusPassDetails = "Integrations dropdown verified successfully";
		statusFailDetails = "Integrations options not found";
		imgName = "IntegrationsDropdown";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority = 4)
	private void verifyHotelsIntegrations() throws Exception {
		report = e.createTest("Verify Hotels options in Integrations dropdown", "To check Hotels Integration is working or not");
		c.click(driver, hpp.homePage_IntegrationsOption);
		e.testInfo(report, "Clicked on Integrations dropdown");
		a.moveTo(driver, hpp.homePage_Integrations_Hotels);
		e.testInfo(report, "Mouse howered on Hotels");
		boolean result;
		result = c.getText(driver, hpp.homePage_Integrations_Hotels_Rezlive).equals("Rezlive");
		result &= c.getText(driver, hpp.homePage_Integrations_Hotels_Agoda).equals("Agoda");
		result &= c.getText(driver, hpp.homePage_Integrations_Hotels_Hotelston).equals("Hotelston");
		statusPassDetails = "Hotels options in Integrations dropdown verified successfully";
		statusFailDetails = "Hotels options not found";
		imgName = "HotelsIntegrations";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority = 5)
	private void verifyFlightsIntegrations() throws Exception {
		report = e.createTest("Verify Flights options in Integrations dropdown", "To check Flights Integration is working or not");
		c.click(driver, hpp.homePage_IntegrationsOption);
		e.testInfo(report, "Clicked on Integrations dropdown");
		a.moveTo(driver, hpp.homePage_Integrations_Flights);
		e.testInfo(report, "Mouse Howered on Flights");
		boolean result;
		result = c.getText(driver, hpp.homePage_Integrations_Flights_Kiwi).equals("Kiwi");
		result &= c.getText(driver, hpp.homePage_Integrations_Flights_Amadeus).equals("Amadeus");
		result &= c.getText(driver, hpp.homePage_Integrations_Flights_AerTicket).equals("Aer Ticket");
		result &= c.getText(driver, hpp.homePage_Integrations_Flights_Duffel).equals("Duffel");
		statusPassDetails = "Flights options in Integrations dropdown verified successfully";
		statusFailDetails = "Flights options not found";
		imgName = "FlightsIntegrations";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority = 6)
	private void verifyToursIntegrations() throws Exception {
		report = e.createTest("Verify Tours options in Integration dropdown", "To check Tours Integration is working or not");
		c.click(driver, hpp.homePage_IntegrationsOption);
		e.testInfo(report, "Clicked on Integrations dropdown");
		a.moveTo(driver, hpp.homePage_Integrations_Tours);
		e.testInfo(report, "Mouse howered on Tours");
		boolean result;
		result = c.getText(driver, hpp.homePage_Integrations_Tours_Tiqets).equals("Tiqets");
		result &= c.getText(driver, hpp.homePage_Integrations_Tours_Viator).equals("Viator");
		statusPassDetails = "Tours options in Integrations dropdown verified successfully";
		statusFailDetails = "Tours options not found";
		imgName = "ToursIntegrations";
//		assertTrue(result, statusFailDetails);
		e.logResults(result, driver, report, imgName, statusPassDetails, statusFailDetails);
	}
	
	@Test(priority = 7)
	private void verifyPricingPage() throws Exception {
		report = e.createTest("Verify Pricing Page", "To check whether Pricing page is opened or not");
		c.click(driver, hpp.homePage_PricingOption);
		e.testInfo(report, "Clicked on Pricing option");
		w.visibilityOfElement(hpp.pricingPage_Header);
		boolean result;
		result = c.currentURL(driver).contains("pricing");
		result &= c.getText(driver, hpp.pricingPage_Header).equals("Plans and Prices");
		statusPassDetails = "Pricing page opened successfully";
		statusFailDetails = "Failed to open Pricing page";
		imgName = "PricingPage";
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
		report = e.createTest("Verify Opening Browser");
		driver = br.openBrowser(".//src//main//resources//Properties//PHPtravels.properties");
		boolean result = driver!=null;
//		if(driver != null) {
//			e.testInfo(report, "Browser Opened");
//			e.testPass(report, "Web Browser opened successfully");
//		}
//		else {
//			e.testInfo(report, "Browser not Opened");
//			e.testfailScreenshot(driver, report, "OpenBrowserFailed", "Failed to Open Browser");
//		}
		e.logResults(result, driver, report, "OpenBrowser", "Browser opened successfully", "Failed to open Browser");
		w = new Waits(driver, 30);
		a = new MouseActions(driver);
	}

	@AfterTest
	private void afterTest() throws Exception {
		report = e.createTest("Verify Closing browser");
		driver = br.closeAllWindows(driver);
		boolean result = driver.toString().contains("null");
//		if(driver.toString().contains("null")) {
//			e.testInfo(report, "Browser Closed");
//			e.testPass(report, "Web Browser closed successfully");
//		}
//		else {
//			e.testInfo(report, "Browser not closed");
//			e.testfailScreenshot(driver, report, "ClosingBrowser", "Failed to close Browser");
//		}
		e.logResults(result, driver, report, "CloseBrowser", "Browser closed successfully", "Failed to close Browser");
		e.flush();
	}

}
