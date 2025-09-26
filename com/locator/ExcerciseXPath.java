package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseXPath {

	public static void main(String[] args) {
		WebDriver drivers=new ChromeDriver();
		drivers.get("https://demo.guru99.com/");
		drivers.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ABC@gmail.com");
		drivers.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String userName = drivers.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(2)")).getText();
		String passWord = drivers.findElement(By.cssSelector("tbody tr:nth-child(5) td:nth-child(2)")).getText();
        System.out.println(userName);
        System.out.println(passWord);

		drivers.navigate().to("https://demo.guru99.com/V4/");
		drivers.findElement(By.xpath("//input[@name='uid']")).sendKeys(userName);
		drivers.findElement(By.xpath("//input[@type='password']")).sendKeys(passWord);
		drivers.findElement(By.xpath("//input[@name='btnLogin']")).click();
        //drivers.findElement(By.cssSelector("div.nav.navbar-nav > ul li :nth-child(1)")).click();
	}//input[@id=Vlaue

}
