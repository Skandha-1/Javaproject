package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Healthasyst {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.healthasyst.com/");
		driver.findElement(By.linkText("CheckinAsyst®")).click();
		driver.findElements(By.tagName("a"));
		System.out.println(driver);
		
	}

}
