/**
 * 
 */
package com.testcase.tc;

import org.testng.annotations.Test;
import com.webapp.base.Dashboard;
import com.webapp.base.Login;
import com.webapp.base.MasterData;

/**
 * @author Geo
 *
 */
public class MasterDataTest extends BaseTest {

	
	@Test(priority = 1)
	public void doMasterTest() {
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"),
				prop.getProperty("Pwd"));
		// it will check whether will get dashboard header
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
		
		MasterData mass = page.getInstance(MasterData.class).MasterDataList();
		//==	
			String com = mass.getCompanyHeader();
			System.out.println(com);
		
	}
}
