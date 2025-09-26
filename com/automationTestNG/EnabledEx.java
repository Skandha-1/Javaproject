package com.automationTestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class EnabledEx {
	WebDriver driver ;
	@BeforeMethod
  
  public void setUp() {
	  System.out.println("Opening browser and launching URL");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/V4/");
  }
@Test(enabled = true,invocationCount = 3,timeOut = 1000,description = "Verifies login functionality with valid credentials")
public void verifyLoginuser() {
	driver.findElement(By.name("uid")).sendKeys("mngr635758");
	driver.findElement(By.name("password")).sendKeys("jenAnYj");
	driver.findElement(By.name("btnLogin")).click();
}
@Test(enabled=true,invocationCount = 1,timeOut = 1000,dependsOnMethods = {"verifyLoginuser"})
public void verifyLoginuser1() {
	driver.findElement(By.name("uid")).sendKeys("Sagar");
	driver.findElement(By.name("password")).sendKeys("sag@123");
	driver.findElement(By.name("btnLogin")).click();
	driver.quit();
	
}
}
 
 