/**
 * 
 */
package com.webapp.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Geo
 *
 */
public class SKU extends BaseClass {

	public SKU(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By clickSKU = By.xpath("//p[contains(text(),'SKU')]");
	By header = By.xpath("//h3[contains(text(),'SKU List')]");
	By addSKU = By.xpath("//a[@title='Add SKU' and @class='btn bg-gradient-danger add-btn-header ml-2']");
	
	
	By radioBtn = By.xpath("//input[@name='jApplicableFor' and @type='radio' and @value='2']");
	

	
	/**
	 * @return the clickSKU
	 */
	public WebElement getClickSKU() {
		return getElement(clickSKU);
	}
	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}
	/**
	 * @return the addSKU
	 */
	public WebElement getAddSKU() {
		return getElement(addSKU);
	}
	 public WebElement clickRadio(){
		 return getElement(radioBtn);
	 }
		// getter
	

		public String getCompanyTitle() {
			return getPageTitle();
		}

		public String getCompanyHeader() {
			return getPageHeader(header);
		}
		
		public SKU SKUDetails(){
			getClickSKU().click();
			System.out.println("SKU is clicked");
			getAddSKU().click();
			
			clickRadio().click();
			sleep();
			
			return getInstance(SKU.class);
			
			
			
		}
		

		public SKU SKUList(){
			getClickSKU().click();
			sleep();
			return getInstance(SKU.class);
		}

}
