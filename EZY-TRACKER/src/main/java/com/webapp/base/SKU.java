/**
 * 
 */
package com.webapp.base;



import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	By radioBtn1 = By.xpath("//input[@name='jApplicableFor' and @type='radio' and @value='1']");

	By radioBtn2 = By.xpath("//input[@name='jApplicableFor' and @type='radio' and @value='2']");
	
	By GST = By.xpath("//span[@id='select2-gst-drp-dwn-container']");
//	 static String gst_xpath = "//span[@title='5%']";
//	
	
	By selectedGST = By.xpath("//span[@id='select2-gst-drp-dwn-container' and @title='222%']");
	
	
	/**
	 * @return the selectedGST
	 */
//	public WebElement getSelectedGST() {
//		return getElement(selectedGST);
//	}

	public WebElement getGST() {
		return getElement(GST);
	}
	
	/*
	 * Dropdown xpath
	 * 
	
	
	
	
	/**
	 * @return the gST
	 
	
//	
	public WebElement getSelectedGST(){
		return getElement(selectedGST);
	}

	/**
	 * @return the hSNNo
	 */
	public WebElement getHSNNo() {
		return getElement(HSNNo);
	}

	By HSNNo = By.xpath("//span[@class='select2-selection select2-selection--single' and @tabindex='7']");
	
	
	/*
	 * dd xpath
	 */
	
	/**
	 * @return the clickSKU
	 */
	public WebElement getClickSKU() {
		return getElement(clickSKU);
	}

	/**
	 * @param selectedGST the selectedGST to set
	 */


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

	public WebElement clickRadio1() {
		return getElement(radioBtn1);
	}

	public WebElement clickRadio2() {
		return getElement(radioBtn2);
	}
	// getter

	public String getCompanyTitle() {
		return getPageTitle();
	}

	public String getCompanyHeader() {
		return getPageHeader(header);
	}

	/*
	 * here dropdown code
	 * 
	 */
	
	
	/*
	 * dropdown code ends 
	 */
	
	
	
	public SKU SKUDetails() {
		getClickSKU().click();
		System.out.println("SKU is clicked");
		getAddSKU().click();
sleep();
		// select radio button

		if ((clickRadio1().isSelected())) {
			clickRadio1().click();
			System.out.println(" 1st radio button is selected: ");
		}
		else{
		clickRadio2().isSelected();
		clickRadio2().click();
		System.out.println(" 2nd radio button is selected: ");
		}
		sleep();
	
		//dropdown
	getGST().click();
		sleep();
	
			/*Selenium Select class is works for HTML <select> tag.
		 * The Select class only works with <select> tags that contain <option> tags. 
		 * If did any other tag, it doesn't matter if it behaves like a <select> would, it will be rejected.
		 */
		WebElement selectedGST = 
				driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		//selectedGST.click();
	//List<WebElement> options =selectedGST.findElements(By.xpath("//span[@id='select2-gst-drp-dwn-container' and @title='222%']"));
	
		
		dropdown(selectedGST,"28%");
		
	
	
	
		return getInstance(SKU.class);
	}
		
	

		

	public SKU SKUList() {
		getClickSKU().click();
		sleep();
		return getInstance(SKU.class);
	}

}
