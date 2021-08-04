package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	private WebDriver driver;
	
	 public Utility(WebDriver driver) {
		 this.driver = driver;
				 
	}

	public void waitForElement(WebDriver driver,WebElement element) {
		 new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOf(element));
	 }
	
	public void waitForElement(WebDriver driver,By locator) {
		 new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(locator));
	 }

}
