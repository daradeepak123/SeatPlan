package common;

import org.openqa.selenium.WebDriver;

public class Alerts {
	
	public void accept(WebDriver alDriver) {
		alDriver.switchTo().alert().accept();
	}
	
	public void dismiss(WebDriver alDriver) {
		alDriver.switchTo().alert().dismiss();
	}
	
	public String getText(WebDriver alDriver) {
		return alDriver.switchTo().alert().getText();
	}
	
	public void sendKeysAlerts(WebDriver alDriver, String text) {
		alDriver.switchTo().alert().sendKeys(text);
	}
	
}
