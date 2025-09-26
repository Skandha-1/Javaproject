package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exericse02Name {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.name("calcSearchTerm")).sendKeys("BMI Calculator");
		System.out.println("Search box used by name");
		driver.findElement(By.id("bluebtn")).click();
	}

}
