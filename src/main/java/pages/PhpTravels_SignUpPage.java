package pages;

import org.openqa.selenium.By;

public class PhpTravels_SignUpPage {
	
	public By homePage_SignUpButton = By.xpath("//li/a[text()='Sign Up']");
	
	public By signUpPage_PersonalInfoSection = By.xpath("//input[@id='inputFirstName']/../../../preceding-sibling::h3");
	public By signUpPage_BillingAddressSection = By.xpath("//input[@id='inputCompanyName']/../../../preceding-sibling::h3");
	public By signUpPage_AddInfoSection = By.xpath("//input[@id='customfield2']/../../../../preceding-sibling::h3");
	public By signUpPage_AccountSecuritySection = By.xpath("//input[@id='inputNewPassword1']/../../../preceding-sibling::h3");
	public By signUpPage_JoinMailListSection = By.xpath("//p[contains(text(),'simply tick the box')]/preceding-sibling::h3");

}
