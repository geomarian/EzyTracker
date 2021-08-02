package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Company extends BaseClass {

	By header = By.xpath("//strong[contains(text(),'Copyright © 2021 Sales Person Tracking')]");

	By clickComp = By.xpath("//p[contains(text(),'Company')]");
	/**
	 * @return the clickComp
	 */
	public WebElement  getClickComp() {
		return getElement(clickComp);
	}

	By Addr = By.id("address");
	By CINNo = By.name("sCinNo");
	By TANNo = By.name("sTanNo");
	
	By updateBtn = By.xpath("//button[contains(text(),'Update')]");

	public WebElement clickUpdate(){
		return getElement(updateBtn);
	}
	
	/**
	 * @return the cINNo
	  */
	public WebElement getCINNo() {
		return getElement(CINNo);
	}

	/**
	 * @return the addr
	 */
	public WebElement getAddr() {
		return getElement(Addr);
	}

	/**
	 * @return the tANNo
	 */
	public WebElement getTANNo() {
		return getElement(TANNo);
	}

	public Company(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// getter
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getCompanyTitle() {
		return getPageTitle();
	}

	public String getCompanyHeader() {
		return getPageHeader(header);
	}
	//

	public Company CompanyDetail(String Addr, String TANNo, String CINNo){
		getClickComp().click();
		getAddr().sendKeys(Addr);
		getTANNo().sendKeys(TANNo);
		getCINNo().sendKeys(CINNo);
		clickUpdate().click();
		System.out.println("update button clicked");
		//will return landing page class object
		return getInstance(Company.class);
		
		
		
	}
	//same method name with parameter & non-parameter is method overloading
	
//	public void CompanyDetails(){
//		getCINNo().sendKeys("");
//		getTANNo().sendKeys("");
//		
//	}
}
