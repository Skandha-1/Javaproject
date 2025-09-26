package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysWithAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		Actions action=new  Actions(driver);
		action.click(searchBox).keyDown(Keys.SHIFT) 
		.sendKeys("selenium")
		.keyUp(Keys. SHIFT)  
		.sendKeys(Keys.ENTER)  
		.build().perform();
		Thread.sleep(2000);
		
		

		
		
		
		
		
		
	}

}
