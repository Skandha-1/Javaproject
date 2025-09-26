package com.automation.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProjectHS\\Drivers\\msedgedriver.exe");
		WebDriver edgedriver = new EdgeDriver();
		
		edgedriver.get("https://www.youtube.com");
		String title=edgedriver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);

		String url=edgedriver.getCurrentUrl();
		System.out.println(url);
		edgedriver.navigate().to("https://www.wikipedia.org");
		Thread.sleep(5000);
		edgedriver.navigate().back();
		edgedriver.navigate().forward();
		edgedriver.navigate().refresh();
		Thread.sleep(5000);
		edgedriver.manage().window().maximize();
	    edgedriver.manage().window().minimize();
	    edgedriver.manage().window().fullscreen();
		
		edgedriver.quit();
	}

}
