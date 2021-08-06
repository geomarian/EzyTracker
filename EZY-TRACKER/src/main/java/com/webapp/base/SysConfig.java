package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SysConfig extends BaseClass {

	public SysConfig(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By clickConfig = By.xpath("//p[contains(text(),'Config')]");
	
	By saveConfig = By.name("submitBtn");
	
	By clickUN = By.id("spnUserName");
	
	By clickLogOut = By.xpath("//a[contains(text(),' Logout')]");
	
	By clickMaster = By.xpath("//body/div[2]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]/p[1]/i[1]");
	/**
	 * @return the clickUN
	 */
	public WebElement getClickUN() {
		return getElement(clickUN);
	}
	public WebElement getMaster(){
		return getElement(clickMaster);
	}
	/**
	 * @return the clickLogOut
	 */
	public WebElement getClickLogOut() {
		return getElement(clickLogOut);
	}

	/**
	 * @return the clickConfig
	 */
	public String getCompanyTitle() {
		return getPageTitle();
	}

	public WebElement getClickConfig() {
		return getElement(clickConfig);
	}

	/**
	 * @return the saveConfig
	 */
	public WebElement getSaveConfig() {
		return getElement(saveConfig);
	}

	public SysConfig onlyConfig(){
		getMaster().click();
		sleep();
		getClickConfig().click();
		getSaveConfig().click();
		sleep();
		getClickUN().click();
		getClickLogOut();
		sleep();
		return getInstance(SysConfig.class);
	}


	
	
}
