package com.testcase.tc;

import org.testng.annotations.Test;

import com.webapp.base.Company;
import com.webapp.base.Dashboard;
import com.webapp.base.Login;

public class CompanyTest extends BaseTest {
	@Test(priority=1)
	public void doCompanyTest(){
		//after login it will show homepage so used homepage = 
		Dashboard homepage = page.getInstance(Login.class).doLogin(prop.getProperty("ACode"), prop.getProperty("UN"), prop.getProperty("Pwd"));
		//it will check whether will get dashboard header
	//	homepage.getDashboardHeader();
		String headerHome = homepage.getDashboardHeader();
		System.out.println(headerHome);
	
//	@Test(priority=2)
//
//	
//	public void CompanyDetail() {
		Company comp = page.getInstance(Company.class).CompanyDetail(prop.getProperty("Addr"), prop.getProperty("TANNo"), prop.getProperty("CINNo"));
	//	comp.getCompanyHeader();
		String com = comp.getCompanyHeader();
		System.out.println("Add & PANNO added " + com);

	}
}



