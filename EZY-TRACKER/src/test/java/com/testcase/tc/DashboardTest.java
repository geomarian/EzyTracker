/**
 * 
 */
package com.testcase.tc;

import org.testng.annotations.Test;


import com.webapp.base.Dashboard;
import com.webapp.base.Login;

/**
 * @author Geo
 *
 */
public class DashboardTest extends BaseTest{
	@Test(priority=1)
	public void doDashboardTest(){
		//after login it will show homepage so used homepage = 
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
		//it will check whether will get dashboard header
	//	homepage.getDashboardHeader();
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
}
//	@Test(priority=2)
//
//	public void dashboardDetails() {
//		Dashboard dash = page.getInstance(Dashboard.class);
//		//dash.getDashboardHeader();
//		String headerHome = dash.getDashboardTitle();
//		System.out.println(headerHome);
//
//	}
}
