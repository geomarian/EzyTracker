package com.webapp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass {

	private By ACode = By.name("sAuthCode");
	private By UN = By.id("userName");
	private By Pwd = By.id("password");
	private By SubmitBtn = By.name("submitBtn");

	private By ddashboard = By.xpath("//p[contains(text(),' Dashboard')]");

	public Login(WebDriver driver) {
		super(driver);
	}

	/**
	 * @return the authCode
	 */
	public WebElement getACode() {
		return getElement(ACode);
	}

	/**
	 * @return the username
	 */
	public WebElement getUN() {
		return getElement(UN);
	}

	/**
	 * @return the password
	 */
	public WebElement getPwd() {
		return getElement(Pwd);
	}

	public WebElement getSubmitBtn() {
		return getElement(SubmitBtn);
	}

	public WebElement getDashboard() {
		return getElement(ddashboard);
	}

	public Dashboard doLogin(String ACode, String UN, String Pwd) {
		getACode().sendKeys(ACode);
		getUN().sendKeys(UN);
		getPwd().sendKeys(Pwd);
		getSubmitBtn().click();

		return getInstance(Dashboard.class);
	}

}
