package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	private WebDriverWait wait;
	
	public Waits(WebDriver wDriver ,int time) {
		wait = new WebDriverWait(wDriver, Duration.ofSeconds(time));
	}
	
	public void alertIsPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void elementClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void visibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
