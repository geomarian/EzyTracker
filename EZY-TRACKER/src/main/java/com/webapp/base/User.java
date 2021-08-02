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
public class User extends BaseClass {

	public User(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By clickUser = By.xpath("//p[contains(text(),'User')]");

	By header = By.xpath("//h3[contains(text(),'User List')]");

	By addUser = By.xpath("//a[@title='Add User' and @class='btn bg-gradient-danger add-btn-header ml-2'] ");

	By addName = By.id("name");

	By UserName = By.id("username");

	By Address = By.id("address");

	By mobileNo = By.id("mobileNumber");

	By Passwords = By.id("password");

	By CPassword = By.name("sConfirmPassword");

	By SubmitBtn = By.name("submitBtn");

	By DeleteUser = By.xpath("//button[@class='actionIcon actionBtn' and @title='Delete User']");

	By DeleteUserYes = By.xpath("//button[@type='button' and @class='btn btn-danger bootbox-accept']");

	/**
	 * @return the deleteUser
	 */
	public WebElement getDeleteUser() {
		return getElement(DeleteUser);
	}

	/**
	 * @return the deleteUserYes
	 */
	public WebElement getDeleteUserYes() {
		return getElement(DeleteUserYes);
	}

	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return getElement(Address);
	}

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return getElement(UserName);
	}

	/**
	 * @return the mobileNo
	 */
	public WebElement getMobileNo() {
		return getElement(mobileNo);
	}

	/**
	 * @return the passwords
	 */
	public WebElement getPasswords() {
		return getElement(Passwords);
	}

	/**
	 * @return the cPassword
	 */
	public WebElement getCPassword() {
		return getElement(CPassword);
	}

	/**
	 * @return the submitBtn
	 */
	public WebElement getSubmitBtn() {
		return getElement(SubmitBtn);
	}

	// private static final Random generator = new Random();
	/**
	 * @return the clickUser
	 */
	public WebElement getClickUser() {
		return getElement(clickUser);
	}

	/**
	 * @return the addUser
	 */
	public WebElement getAddUser() {
		return getElement(addUser);
	}

	/**
	 * @return the addName
	 */
	public WebElement getAddName() {

		return getElement(addName);
	}

	/*
	 * public static final String SOURCE = "Abcdefghijklmnopqstrz"; static
	 * SecureRandom secureRnd = new SecureRandom();
	 * 
	 * public static String randomString(int length){ StringBuilder sb=new
	 * StringBuilder(length); for(int i=0; i<=length;i++)
	 * 
	 * sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); return
	 * sb.toString();
	 * 
	 * }
	 */
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

	public User UserDetail(String addName, String UserName, String Address, String MobileNo, String Passwords,
			String CPassword) {
		getClickUser().click();
		sleep();
		getAddUser().click();
		sleep();
		getAddName().sendKeys(addName);
		getMobileNo().sendKeys(UserName);
		getUserName().sendKeys(Address);
		getPasswords().sendKeys(MobileNo);
		getCPassword().sendKeys(Passwords);
		getAddress().sendKeys(CPassword);

		getSubmitBtn().click();
		return getInstance(User.class);
	}

	// navigate to list
	public User userlist() {
		getClickUser().click();
		sleep();
		getDeleteUser().click();
		sleep();
		System.out.println("clicked on delete");
		getDeleteUserYes().click();
		sleep();
		//
		return getInstance(User.class);
	}

}
