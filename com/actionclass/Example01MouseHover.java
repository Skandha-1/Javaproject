package com.actionclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example01MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//div[@class='uiU-ZX']
		Actions actions=new Actions(driver);
		WebElement loginMenu=driver.findElement(By.xpath("//span[text()='Login']"));
		actions.moveToElement(loginMenu).perform();
		
		System.out.println("Mouse hover performed");
	}

}
