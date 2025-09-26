package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuruAssignament {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.findElement(By.xpath("//select[@id='user_title']")).click();
		Select titleDropdown = new Select(driver.findElement(By.id("user_title")));
		titleDropdown.selectByVisibleText("Miss");
		driver.findElement(By.id("user_firstname")).sendKeys("Skandha");
		driver.findElement(By.id("user_surname")).sendKeys("Jain");
		driver.findElement(By.id("user_phone")).sendKeys("7975689246");
		driver.findElement(By.cssSelector("#user_dateofbirth_1i")).click();
		Select datebirth=new Select(driver.findElement(By.cssSelector("#user_dateofbirth_1i")));
		datebirth.selectByVisibleText("1989");
		driver.findElement(By.id("user_dateofbirth_2i")).click();
		Select datemonth=new Select(driver.findElement(By.cssSelector("#user_dateofbirth_2i")));
		datemonth.selectByVisibleText("May");
		driver.findElement(By.id("user_dateofbirth_3i")).click();
		Select date=new Select(driver.findElement(By.cssSelector("#user_dateofbirth_3i")));
		date.selectByVisibleText("26");
		driver.findElement(By.xpath("//input[@value='Provisional' and @type='radio']")).click();
		driver.findElement(By.id("user_licenceperiod")).click();
		Select licenceDropDown=new Select(driver.findElement(By.id("user_licenceperiod")));
		licenceDropDown.selectByVisibleText("17");
		driver.findElement(By.id("user_occupation_id")).click();
		Select occupation=new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByVisibleText("Social worker");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Belthangady");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Belthanagady");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Inida");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("574214");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("AD2123");
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("AD2123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector(".btn.btn-default")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("AD2123");
//		driver.findElement(By.name("submit")).click();
//		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
//
//		driver.findElement(By.linkText("LinkedIn")).click();
		String originalWindow = driver.getWindowHandle();
        WebElement linkedinLink = driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]"));
        linkedinLink.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
 
        System.out.println("LinkedIn:" + driver.getCurrentUrl());
 
        driver.close();
        driver.switchTo().window(originalWindow);
 
        
        WebElement facebookLink = driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]"));
        facebookLink.click();
 
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
 
        System.out.println("Facebook: " + driver.getCurrentUrl());
 
        
        driver.quit();
 
 
   
	}
 

	}


