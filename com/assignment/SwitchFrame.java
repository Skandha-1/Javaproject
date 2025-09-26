package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(1);
		WebElement box=driver.findElement(By.cssSelector("demo-frame"));
		
		System.out.println("Button text inside frame "+box.getText());
		
		
		driver.switchTo().defaultContent();
		System.out.println("Back to main page");
		Thread.sleep(1000);
		driver.quit();

	}

}
