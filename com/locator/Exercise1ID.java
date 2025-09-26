package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Exercise1ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProjectHS\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
		userName.clear();
		userName.sendKeys("standard_user");
	
		password.clear();
		password.sendKeys("secret_sau");
	
		login.click();
		
		System.out.println("Username entered using id");
		
	}

}
