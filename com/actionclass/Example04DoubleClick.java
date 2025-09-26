package com.actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example04DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions=new Actions(driver);
		WebElement doubleClick =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		actions.contextClick(doubleClick).perform();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text"+alert.getText());
		alert.accept();
		
		driver.quit();
	}

}
