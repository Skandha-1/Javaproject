package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2Parentclass {

	public static void main(String[] args) {
		WebDriver drivers=new ChromeDriver();
		//drivers.get("https://the-internet.herokuapp.com/add_remove_elements/");
//		drivers.manage().window().maximize();
//		drivers.findElement(By.cssSelector("div#content > div > button")).click();
//		drivers.findElement(By.linkText("Elemental Selenium")).click();
//		drivers.findElement(By.cssSelector("div.col.col--8.col--offset-2 > div.text--center > div > button")).click();
		drivers.get("https://the-internet.herokuapp.com/tables");
		String name=drivers.findElement(By.cssSelector("#table1 thead tr:nth-child(1) th:nth-child(6)")).getText();
		System.out.println(name);
		String lastName=drivers.findElement(By.cssSelector("#table1 tr:nth-child(4) td:nth-child(1)")).getText();
		System.out.println("Second row last name:"+lastName);
		String name2 =drivers.findElement(By.cssSelector("#table1 tbody tr:nth-child(2) td:nth-child(5)")).getText();
		drivers.navigate().to(name2);
		System.out.println(name2);
		
	}

}
