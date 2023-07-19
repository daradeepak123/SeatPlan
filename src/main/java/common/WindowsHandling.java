package common;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHandling {
	
	public String parentWindow;
	public String childWindow;
	
	public WindowsHandling(WebDriver whDriver) {
		parentWindow = whDriver.getWindowHandle();
		Set<String> windows = whDriver.getWindowHandles();
		for(String s: windows) {
			if(!s.equals(parentWindow)) {
				childWindow = s;
			}
		}
	}
	
	public WebDriver switchToWindow(WebDriver whDriver) {
		if(whDriver.getWindowHandle().equals(parentWindow))
			whDriver.switchTo().window(childWindow);
		else
			whDriver.switchTo().window(parentWindow);
		return whDriver;
	}

}
