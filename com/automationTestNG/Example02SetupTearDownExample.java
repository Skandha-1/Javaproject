package com.automationTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example02SetupTearDownExample {
	WebDriver driver;
	@BeforeMethod
  public void setUp() {
	  System.out.println("Opening browser and launching URL");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/V4/");
	  
	  
  }
  @Test(priority=1)
  public void verifyHomePageTitle() {
	  String title =driver.getTitle();
	  System.out.println("Test 1: Home Page Title is:"+title);
  }
  @Test(priority=0)
  public void verifyCurrentUrl() throws InterruptedException{
	  String currentUrl=driver.getCurrentUrl();
	  System.out.println("Test 2 :Current URL is:"+currentUrl);
  }
  @AfterMethod
 
  public void tearDown() {
	  System.out.println("closing browser");
  }
}


