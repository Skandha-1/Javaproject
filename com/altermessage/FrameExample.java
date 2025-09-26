package com.altermessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(1);
		WebElement button = driver.findElement(By.id("Click"));
		System.out.println("Button text inside frame "+button.getText());
		
		//Switch back
		driver.switchTo().defaultContent();
		System.out.println("Back to main page");
		Thread.sleep(1000);
		//driver.quit();
	}

}
