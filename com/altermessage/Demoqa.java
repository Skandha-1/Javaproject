package com.altermessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text inside iframe:"+heading.getText());
		
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
