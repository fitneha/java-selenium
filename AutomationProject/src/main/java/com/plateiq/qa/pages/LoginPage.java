package com.plateiq.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.plateiq.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory objects
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//a[.='Log In']")
	WebElement login;
	
    @FindBy(xpath="//p[text()='Invalid login']")
    WebElement invalidLogin;
	
    public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String un, String pwd) {
		login.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public String validateInvalidLogin() {
		return invalidLogin.getText();
	}
	
	

}
