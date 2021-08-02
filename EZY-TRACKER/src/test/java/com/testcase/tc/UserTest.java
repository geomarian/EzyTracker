package com.testcase.tc;

import org.testng.annotations.Test;

import com.webapp.base.Dashboard;
import com.webapp.base.Login;
import com.webapp.base.User;

public class UserTest extends BaseTest {
	
	@Test(priority=1)
	public void doUserTest() {
	Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
	//it will check whether will get dashboard header
	String headerHome = homepage.getDashboardHeader();
	System.out.println(headerHome);
	
	//will add new user
	User use = page.getInstance(User.class).UserDetail(prop.getProperty("addName"), prop.getProperty("MobileNo"), prop.getProperty("UserName"), prop.getProperty("Passwords"), prop.getProperty("CPassword"), prop.getProperty("Address"));
	String com = use.getPageTitle();
	System.out.println(com);
			
	//will delete new user from list
	
	
	}
	
	@Test(priority=2)
	public void deleteUser() {
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
		//it will check whether will get dashboard header
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
		
		User del =page.getInstance(User.class).userlist();
		String d = del.getPageTitle();
		System.out.println("User deleted" + d);
	}
	
}

