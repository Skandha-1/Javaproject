package com.automation.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProjectHS\\Drivers\\msedgedriver.exe");
		WebDriver edgedriver = new EdgeDriver();
		
		edgedriver.navigate().to("https://www.amazon.in");
		String title1=edgedriver.getTitle();
		System.out.println(title1);
		String currenturl=edgedriver.getCurrentUrl();
		System.out.println(currenturl);
		edgedriver.navigate().to("https://www.flipkart.com");
		edgedriver.navigate().back();
		edgedriver.navigate().forward();
		edgedriver.navigate().refresh();
		String windowhandle=edgedriver.getWindowHandle();
		
		edgedriver.manage().window().maximize();
	    edgedriver.manage().window().minimize();
	    edgedriver.manage().window().fullscreen();
		
		edgedriver.quit();
		

	}

}
