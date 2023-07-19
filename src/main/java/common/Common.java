package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {
	
	public String getText(WebDriver cDriver, By locator) {
		return cDriver.findElement(locator).getText();
	}
	
	public String currentURL(WebDriver cDriver) {
		return cDriver.getCurrentUrl();
	}
	
	public String getAttributeValue(WebDriver cDriver, By locator, String attribute) {
//		System.out.println(cDriver.findElement(locator).getAttribute(attribute));
		return cDriver.findElement(locator).getAttribute(attribute);
	}
	
	public void click(WebDriver cDriver, By locator) {
		cDriver.findElement(locator).click();
	}
	
	public String getTitle(WebDriver cDriver) {
		return cDriver.getTitle();
	}
	
}
