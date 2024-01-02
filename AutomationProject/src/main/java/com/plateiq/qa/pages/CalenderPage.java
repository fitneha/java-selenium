package com.plateiq.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.plateiq.qa.base.TestBase;

public class CalenderPage extends TestBase {
	
	@FindBy(xpath="//a[@class='item active']//i[1]")
	WebElement calender;
	
	public CalenderPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateCalenderPageTitle() {
		calender.click();
		return calender.getText();
	}
	
	

}
