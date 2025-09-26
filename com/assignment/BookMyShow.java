package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
		 
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
				driver.findElement(By.xpath("//div[@id='common-header-region']//*[name()='svg']")).click();
				List<WebElement> CityNames = driver.findElements(By.cssSelector(".sc-eykeme-1.iVbwwW"));
				System.out.println(CityNames.size());
		 
		 
				for (WebElement city : CityNames) {
		            String altText = city.getAttribute("alt");
		            if(altText.equals("Mumbai")) {
		               city.click();
		 
		            }
		        }
		    }
		 
		}
		 
		 
 