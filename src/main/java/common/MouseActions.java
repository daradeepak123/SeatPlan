package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	private Actions action;
	
	public MouseActions(WebDriver aDriver) {
		action = new Actions(aDriver);
	}
	
	public void click() {
		action.click().build().perform();
	}
	
	public void click(WebDriver aDriver, By locator) {
		action.click(aDriver.findElement(locator)).build().perform();
	}
	
	public void clickAndHold(WebDriver aDriver, By locator) {
		action.clickAndHold(aDriver.findElement(locator)).build().perform();
	}
	
	public void rightClick(WebDriver aDriver, By locator) {
		action.contextClick(aDriver.findElement(locator)).build().perform();
	}
	
	public void dragAndDrop(WebDriver aDriver, By sourceLocator, By targetLocator) {
		action.dragAndDrop(aDriver.findElement(sourceLocator), aDriver.findElement(targetLocator)).build().perform();
	}
	
	public void dragAndDrop(WebDriver aDriver, By sourceLocator, int x, int y) {
		action.dragAndDropBy(aDriver.findElement(sourceLocator), x, y).build().perform();
	}
	
	public void moveTo(WebDriver aDriver, By locator) {
		action.moveToElement(aDriver.findElement(locator)).build().perform();
	}
	
	public void moveTo(int x, int y) {
		action.moveByOffset(x, y).build().perform();
	}
	
	public void release() {
		action.release().build().perform();
	}
	
	public void scrollToElement(WebDriver aDriver, By locator) {
		action.scrollToElement(aDriver.findElement(locator)).build().perform();
	}
	
	public void sendKeys(WebDriver aDriver, By locator, String text) {
		action.sendKeys(aDriver.findElement(locator), text).build().perform();
	}
	
	public void selectAll(WebDriver aDriver, By locator) {
		action.sendKeys(aDriver.findElement(locator), Keys.chord(Keys.CONTROL + "a")).build().perform();
	}
	
	public void copy() {
		action.sendKeys(Keys.chord(Keys.CONTROL, "c")).build().perform();
	}
	
	public void copy(WebDriver aDriver, By locator) {
		action.sendKeys(aDriver.findElement(locator), Keys.chord(Keys.CONTROL, "c")).build().perform();
	}
	
	public void paste() {
		action.sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
	}
	
	public void paste(WebDriver aDriver, By locator) {
		action.sendKeys(aDriver.findElement(locator), Keys.chord(Keys.CONTROL, "v")).build().perform();
	}
	
	public void pageUp() {
		action.sendKeys(Keys.PAGE_UP).build().perform();
	}
	
	public void pageDown() {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	public void home() {
		action.sendKeys(Keys.HOME).build().perform();
	}
	
	public void end() {
		action.sendKeys(Keys.END).build().perform();
	}
	
	public void enter() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void backSpace() {
		action.sendKeys(Keys.BACK_SPACE).build().perform();
	}
	
	public void delete() {
		action.sendKeys(Keys.DELETE).build().perform();
	}
	
	public void delete(WebDriver aDriver, By locator) {
		action.sendKeys(aDriver.findElement(locator), Keys.DELETE).build().perform();
	}
	
}
