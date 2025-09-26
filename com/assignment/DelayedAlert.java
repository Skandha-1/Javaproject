package com.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelayedAlert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert message :CLick me");
		alert.accept();
	}

}
