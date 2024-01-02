package com.plateiq.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.plateiq.qa.base.TestBase;
import com.plateiq.qa.pages.CalenderPage;
import com.plateiq.qa.pages.HomePage;
import com.plateiq.qa.pages.LoginPage;

public class CalenderPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CalenderPage calenderPage;
	
	public CalenderPageTest() {
		super();
	}
 @BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		 
		}
 @Test(priority=1)
 public void CalenderPageTitleTest() {
	 loginPage.login(getObjProp.getProperty("LoginUserId"), getObjProp.getProperty("LoginPwd"));
	 String title=calenderPage.validateCalenderPageTitle();
	 Assert.assertEquals(title, "#1 Free CRM Power Up your Entire Business Free Forever");
	 
 }

}
