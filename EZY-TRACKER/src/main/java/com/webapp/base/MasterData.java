package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterData extends BaseClass {

	By header = By.xpath("//strong[contains(text(),'Copyright © 2021 Sales Person Tracking')]");
	By clickMaster = By.xpath("//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]/p[1]/i[1]");
	By clickState = By.xpath("//p[contains(text(),'State')]");
	By clickCity = By.xpath("//p[contains(text(),'City')]");

	/**
	 * @return the header
	 */
	public MasterData(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public WebElement getMaster() {
		return getElement(clickMaster);
	}

	/**
	 * @return the clickState
	 */
	public WebElement getClickState() {
		return getElement(clickState);
	}

	/**
	 * @return the clickCity
	 */
	public WebElement getClickCity() {
		return getElement(clickCity);
	}
	// getter

	public String getCompanyTitle() {
		return getPageTitle();
	}

	public String getCompanyHeader() {
		return getPageHeader(header);
	}

	public MasterData MasterDataList() {
		getMaster().click();
		sleep();
		getClickState().click();
		sleep();
		getClickCity().click();
		sleep();
		return getInstance(MasterData.class);
	}
}
