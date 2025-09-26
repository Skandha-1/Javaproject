package com.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangealert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.findElement(By.cssSelector(".oxd-text.oxd-text--p")).click();
	}

}
