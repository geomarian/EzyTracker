package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;



public class BaseClass extends Page {
	
	
	public BaseClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@Override

	public String getPageTitle() {

		return driver.getTitle();
	}

	@Override
	// get Web header by passing the locater
	public String getPageHeader(By locator) {
		return getElement(locator).getText();

	}

	@Override
	public WebElement getElement(By locator) {
		
		WebElement element = null;
		try {
			// apply Wait before getting element
			waitForElementPresent(locator);
			element = driver.findElement(locator);
			// in try block if any exception is comin in above line then it
			// will not return the actual elemnt, it will return null
			return element;
		} catch (Exception e) {
			System.out.println("Some error occured while creating element" + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {

			/*
			 * Wait is coming from page class so need to declare webdriver.wait
			 */
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		} catch (Exception e) {
			System.out.println("Exception error" + locator.toString());
		}
	}

	@Override
	public void waitForElementTitle(String title) {

		try {

			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			System.out.println("Exception error" + title.toString());
		}
	}

}
