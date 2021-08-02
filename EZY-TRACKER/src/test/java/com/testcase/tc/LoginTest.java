package com.testcase.tc;

import org.testng.annotations.Test;


import com.webapp.base.Dashboard;
import com.webapp.base.Login;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void doLoginTest(){
		//after login it will show homepage so used homepage = 
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
		//it will check whether will get dashboard header
	//	homepage.getDashboardHeader();
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
}

}
