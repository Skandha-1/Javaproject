package com.altermessage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.name("emailid")).sendKeys("ABC@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.navigate().to("https://demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys("Sakndha JAin");
		driver.findElement(By.name("password")).sendKeys("SADFAadf");
		driver.findElement(By.name("btnLogin")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text "+ alert.getText());
		
		alert.accept();
		System.out.println("Alert accepted");
		
	}


}
