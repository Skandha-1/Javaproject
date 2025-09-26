package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise04 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Clicked Login using Linktext");
		
		
			
	}

}
