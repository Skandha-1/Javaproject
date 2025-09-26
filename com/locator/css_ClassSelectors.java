package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_ClassSelectors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		//driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector("input[id*='user']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id^='pass']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[id$='button']")).click();
		
	}

}
