package pages;

import org.openqa.selenium.By;

public class PhpTravels_HomeAndPricingPage {
	
	public By homePage_DemoOption = By.xpath("//div[@id='overdueNotification-mobile']/following-sibling::div/following-sibling::ul/li/a[contains(@href,'demo')]");
	public By homePage_PricingOption = By.xpath("//div[@id='overdueNotification-mobile']/following-sibling::div/following-sibling::ul/li/a[contains(@href,'pricing')]");
	public By homePage_FeaturesOption = By.xpath("//div[@id='overdueNotification-mobile']/following-sibling::div/following-sibling::ul/li/a[text()='Features']");
	public By homePage_IntegrationsOption = By.xpath("//div[@id='overdueNotification-mobile']/following-sibling::div/following-sibling::ul/li/a[text()='Integrations']");
	public By homePage_CompanyOption = By.xpath("//span[@class='supportLabel']");
	
	public By homePage_Features_MainFeatures = By.xpath("//li[text()='Features']/following-sibling::li[1]//span");
	public By homePage_Features_HotelsModule = By.xpath("//li[text()='Features']/following-sibling::li[2]//span");
	public By homePage_Features_FlightsModule = By.xpath("//li[text()='Features']/following-sibling::li[3]//span");
	public By homePage_Features_ToursModule = By.xpath("//li[text()='Features']/following-sibling::li[4]//span");
	public By homePage_Features_CarsModule = By.xpath("//li[text()='Features']/following-sibling::li[5]//span");
	public By homePage_Features_OffersModule = By.xpath("//li[text()='Features']/following-sibling::li[6]//span");
	public By homePage_Features_BlogModule = By.xpath("//li[text()='Features']/following-sibling::li[7]//span");
	public By homePage_Features_NewsLetterModule = By.xpath("//li[text()='Features']/following-sibling::li[8]//span");
	public By homePage_Features_CmsModule = By.xpath("//li[text()='Features']/following-sibling::li[9]//span");
	
	public By homePage_Integrations_Hotels = By.xpath("//li[@id='menuToggle-2']/button");
	public By homePage_Integrations_Flights = By.xpath("//li[@id='menuToggle-3']/button");
	public By homePage_Integrations_Tours = By.xpath("//li[@id='menuToggle-4']/button");
	public By homePage_Integrations_Cars = By.xpath("//li[@id='menuToggle-5']/button");
	
	public By homePage_Integrations_Hotels_Rezlive = By.xpath("//li[text()='HOTELS INTEGRATIONS']/following-sibling::li[1]//span");
	public By homePage_Integrations_Hotels_Agoda = By.xpath("//li[text()='HOTELS INTEGRATIONS']/following-sibling::li[2]//span");
	public By homePage_Integrations_Hotels_Hotelston = By.xpath("//li[text()='HOTELS INTEGRATIONS']/following-sibling::li[3]//span");
	
	public By homePage_Integrations_Flights_Kiwi = By.xpath("//li[text()='FLIGHTS INTEGRATIONS']/following-sibling::li[1]//span");
	public By homePage_Integrations_Flights_Amadeus = By.xpath("//li[text()='FLIGHTS INTEGRATIONS']/following-sibling::li[2]//span");
	public By homePage_Integrations_Flights_AerTicket = By.xpath("//li[text()='FLIGHTS INTEGRATIONS']/following-sibling::li[3]//span");
	public By homePage_Integrations_Flights_Duffel = By.xpath("//li[text()='FLIGHTS INTEGRATIONS']/following-sibling::li[4]//span");
	
	public By homePage_Integrations_Tours_Tiqets = By.xpath("//li[text()='TOURS INTEGRATIONS']/following-sibling::li[1]//span");
	public By homePage_Integrations_Tours_Viator = By.xpath("//li[text()='TOURS INTEGRATIONS']/following-sibling::li[2]//span");
	
	public By pricingPage_Header = By.xpath("//div[@id='content']//h1");

}
