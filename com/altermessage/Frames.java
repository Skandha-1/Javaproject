package com.altermessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thirumalaindustries.com/");
		driver.switchTo().frame(1);
		//driver.findElements(By.cssSelector(".chakra-button.css-12evla6"));
		
	}

}
