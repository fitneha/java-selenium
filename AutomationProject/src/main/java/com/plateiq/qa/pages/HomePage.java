package com.plateiq.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.plateiq.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
