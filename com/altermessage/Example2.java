package com.altermessage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
				
				Alert alert = driver.switchTo().alert();
				System.out.println("Alert text "+ alert.getText());
				
				alert.accept();
				System.out.println("Alert accepted");
				Thread .sleep(2000);
				
				driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
				driver.switchTo().alert();
				System.out.println("Alert text "+ alert.getText());
				
				alert.accept();
				System.out.println("Alert dismiss");
				Thread .sleep(5000);
				
				driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).sendKeys("Selenium");
			    driver.switchTo().alert();
				System.out.println("Alert text "+ alert.getText());
				
				alert.accept();
				System.out.println("Alert Prompt");
				
				
				
			
	}

}
