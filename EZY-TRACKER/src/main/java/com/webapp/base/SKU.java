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

	/**
	 * @return the radioBtn2
	 */

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

	public SKU SKUDetails() {
		getClickSKU().click();
		System.out.println("SKU is clicked");
		getAddSKU().click();

		// select radio button

		if ((clickRadio1().isSelected())) {
			clickRadio1().click();
			System.out.println(" 1st radio button is selected:   ");
		}

		clickRadio2().isSelected();
		clickRadio2().click();
		System.out.println(" 2nd radio button is selected: ");

		sleep();

		return getInstance(SKU.class);

	}

	public SKU SKUList() {
		getClickSKU().click();
		sleep();
		return getInstance(SKU.class);
	}

}
