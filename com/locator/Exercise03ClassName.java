package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise03ClassName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		driver.findElement(By.className("gNO89b")).click();

		System.out.println("Clicked using ClassName");
		driver.quit();
		}

	}


