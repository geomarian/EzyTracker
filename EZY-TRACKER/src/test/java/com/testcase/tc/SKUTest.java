/**
 * 
 */
package com.testcase.tc;

import org.testng.annotations.Test;

import com.webapp.base.Dashboard;
import com.webapp.base.Login;
import com.webapp.base.SKU;

/**
 * @author Geo
 *
 */
public class SKUTest extends BaseTest {

	@Test(priority = 1, enabled = true)
	public void newSKU() {
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"),
				prop.getProperty("Pwd"));
		// it will check whether will get dashboard header
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);

		SKU skus = page.getInstance(SKU.class).SKUDetails();
		sleep();
		String com = skus.getPageTitle();

		// WebElement r =
		// driver.findElements(By.xpath("//input[@name='jApplicableFor' and
		// @type='radio' and @value='2']"))
		System.out.println(com);

	}

	@Test(priority = 2, enabled = false)
	public void SKUTableList() {
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"),
				prop.getProperty("Pwd"));
		// it will check whether will get dashboard header
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);

		SKU skuList = page.getInstance(SKU.class).SKUList();

		String title = skuList.getPageTitle();
		System.out.println(title);

	}
}
