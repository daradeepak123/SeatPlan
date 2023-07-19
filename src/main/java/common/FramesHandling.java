package common;

import org.openqa.selenium.WebDriver;

public class FramesHandling {
	
	public void switchToFrame(WebDriver fDriver, int index) {
		fDriver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver fDriver, String frameNameOrId) {
		fDriver.switchTo().frame(frameNameOrId);
	}
	
	public void switchToParentFrame(WebDriver fDriver) {
		fDriver.switchTo().parentFrame();
	}
	
	public void switchToDefault(WebDriver fDriver) {
		fDriver.switchTo().defaultContent();
	}
	
}
