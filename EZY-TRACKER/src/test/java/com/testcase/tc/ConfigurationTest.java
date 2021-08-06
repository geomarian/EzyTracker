/**
 * 
 */
package com.testcase.tc;

import org.testng.annotations.Test;

import com.webapp.base.Dashboard;
import com.webapp.base.Login;
import com.webapp.base.MasterData;
import com.webapp.base.SysConfig;

/**
 * @author Geo
 *
 */
public class ConfigurationTest extends BaseTest {
	
	@Test(priority = 1)
	public void ConfigTest() {
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"),
				prop.getProperty("Pwd"));
		// it will check whether will get dashboard header
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
		sleep();
		SysConfig mass = page.getInstance(SysConfig.class).onlyConfig();
		//	comp.getCompanyHeader();
		sleep();
			String com = mass.getCompanyTitle();
			System.out.println(com);
			
		
		
	}
	

}
