package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressWebsite {

	public static void main(String[] args) {
		WebDriver drivers=new ChromeDriver();
		drivers.get("https://demo.guru99.com/test/newtours/register.php");
		drivers.findElement(By.name("address1")).sendKeys("123 Main Street,Banglore");
		System.out.println("Address entred sucessfully");
	}

}
