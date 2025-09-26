package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
		System.out.println("Search text entered successfully");
		
	
		
	}
 
}
 
