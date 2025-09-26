package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		WebDriver drivers=new ChromeDriver();
		drivers.get("https://www.google.com/");
		drivers.findElement(By.linkText("Gmail")).click();
		System.out.println("Gmail link clicked successfully");
		drivers.quit();
	}

}
