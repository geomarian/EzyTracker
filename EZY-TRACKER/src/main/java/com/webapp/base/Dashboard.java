/**
 * 
 */
package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Geo
 *
 */
public class Dashboard extends BaseClass {

	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By header = By.xpath("//strong[contains(text(),'Copyright © 2021 Sales Person Tracking')]");
	
	// getter
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getDashboardTitle() {
		return getPageTitle();
	}

	public String getDashboardHeader() {
		return getPageHeader(header);
	}
	//

	
	
	
	
	}
	
	
	

