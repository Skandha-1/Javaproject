package com.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciWait {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("demo-frame"))));
		System.out.println(driver.findElement(By.id("droppable")).getText());
		
	}

}
