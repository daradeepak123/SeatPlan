package pages;

import org.openqa.selenium.By;

public class PhpTravels_DemoPage {
	
	public By homePage_DemoOption = By.xpath("//div[@id='overdueNotification-mobile']/following-sibling::div/following-sibling::ul/li/a[contains(@href,'demo')]");
	public By demoPage_FNameField = By.name("first_name");
	public By demoPage_LNameField = By.name("last_name");
	public By demoPage_BusinessNameField = By.name("business_name");
	public By demoPage_EMailField = By.name("email");
	
}
