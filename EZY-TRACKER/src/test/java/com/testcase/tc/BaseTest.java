package com.testcase.tc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.util.WebEventListener;
import com.webapp.base.BaseClass;
import com.webapp.base.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	// we added page here so that we can inherit this pgae class refernece in
	// login test & others
	public Page page;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;

	public BaseTest() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"E:/GEO/Selenium Sample/EZY-TRACKER/src/main/java/com/config/Configuration.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	// getting browser from testng
	@Parameters(value = { "browser" })
	public void setUpTest(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		if (browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			Reporter.log("google opened");
		} else {
			System.out.println("no browser found...");
		}
		driver.get(prop.getProperty("url"));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * now we have to call constructor of page class now cannot create
		 * object like , page = new Page(); because it is abstract class now for
		 * that to call constructor of page class we have to use with the help
		 * of Child class of the PageClass of the abstract class.
		 */
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		page = new BaseClass(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}