package com.plateiq.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static Properties getObjProp;
    
	
    public TestBase() {
      getObjProp = new Properties();
        try {
            getObjProp.load(new FileInputStream(new File("C:\\projectselenium\\newProject\\AutomationProject\\src\\main\\java\\com\\plateiq\\qa\\config\\testProperty.properties")));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("File is not found in the location ");
        }
    }
        

	public static void initialization() {
		String browsertype =getObjProp.getProperty("browser");
		if(browsertype.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\projectselenium\\newProject\\AutomationProject\\src\\test\\java\\resources\\drivers\\chrome-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsertype.equals("firefox")){
			System.setProperty("webdiver.firefox.driver", "");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(getObjProp.getProperty("LoginURL"));
    
    

}}
