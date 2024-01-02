package com.plateiq.qa.testcases;
import com.plateiq.qa.pages.HomePage;
import com.plateiq.qa.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.plateiq.qa.base.TestBase;
public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
//	private String un=getObjProp.getProperty("LoginUserId");
//	private String pwd=getObjProp.getProperty("LoginPwd");
	
//it will execute the properties 	
	public LoginPageTest() {
		super();
	}
 @BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		}
 
 @Test(priority=1)
 public void loginPageTitleTest() {
	 String title=loginPage.validateLoginPageTitle();
	 Assert.assertEquals(title, "#1 Free CRM Power Up your Entire Business Free Forever");
	 
 }
 

//login with valid credentials.
 @Test(priority=3)
 public void loginTest() {
	 loginPage.login(getObjProp.getProperty("LoginUserId"), getObjProp.getProperty("LoginPwd"));
 }
 //login with invalid username and valid password
 @Test(priority=4)
 public void loginTest1() {
	loginPage.login("invalidun", getObjProp.getProperty("LoginPwd"));
	String text=loginPage.validateInvalidLogin();
	Assert.assertEquals(text, "Invalid login");
    
}
 
/*//login with valid username and invalid password
 @Test(priority=5)
 public void loginTest2() {
	 loginPage.login(getObjProp.getProperty("LoginUserId"), "invalidpwd");
     }
// 
// //login with invalid credentials
 @Test(priority=6)
 public void loginTest3() {
	 homePage=loginPage.login("invalidun", "invalidpwd");
 }
// 
// //login with blank username and valid password
 @Test(priority=7)
 public void loginTest4() {
	 homePage=loginPage.login(" ", getObjProp.getProperty("LoginPwd"));
 }
//
// //login with valid username and blank password
 @Test(priority=8)
 public void loginTest5() {
	 homePage=loginPage.login(getObjProp.getProperty("LoginUserId"), " ");
 }
// 
// //login with both blank un and pwd
 @Test(priority=9)
 public void loginTest6() {
	 homePage=loginPage.login(" ", " ");
 }
// 
// //login with password that does not meet the password policy requirement
 @Test(priority=10)
 public void loginTest7() {
	 homePage=loginPage.login(getObjProp.getProperty("LoginUserId"), "pwd@123456789000088tttt");
 }
// 
// //login with all special character username
 @Test(priority=11)
 public void loginTest8() {
	 homePage=loginPage.login("$@#%^&", getObjProp.getProperty("LoginPwd"));
 }
// 
// //login with min username characters allowed
 @Test(priority=12)
 public void loginTest9() {
	 homePage=loginPage.login("u", getObjProp.getProperty("LoginPwd"));
 }
// 
// //login with max username charcters allowed
 @Test(priority=13)
 public void loginTest10() {
	 homePage=loginPage.login("undffffffjjjjjjjjjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", getObjProp.getProperty("LoginPwd"));
 }
// 
// //login beyond maximum charcters username
 @Test(priority=14)
 public void loginTest11() {
	 homePage=loginPage.login("455555555555fkhccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccckkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk5555cfjgc", getObjProp.getProperty("LoginPwd"));
 }
// *
 * 
 */
// 
 @AfterMethod
 public void tearDown() {
		driver.quit();
		}

 
}
