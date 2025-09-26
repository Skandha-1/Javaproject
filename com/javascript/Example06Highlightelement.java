package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06Highlightelement {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:green;border:2px solid red;');",searchBox);
		
	System.out.println("Highlighted search box");
	}

}
