package com.automation.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//launching or opening chrome brose
		
//		 WebDriver chromedriver = new ChromeDriver();
//		 System.out.println("Sucessfully oepned Chrome browser");
//			chromedriver.get("https://en.wikipedia.org/wiki/Main_Page");
//			String title = chromedriver.getTitle();
//			System.out.println(title);
//			
//			chromedriver.close();
//	
//	 //launching or opening FirefoxDriver WebDriver firefoxdriver = new
//		 WebDriver firefoxdriver=new FirefoxDriver(); 
//		 System.out.println("Sucessfully oepned Firefox browser");
		

		System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProjectHS\\Drivers\\msedgedriver.exe");
		WebDriver edgedriver = new EdgeDriver();
		
		edgedriver.get("https://en.wikipedia.org/wiki/Main_Page");
		String title = edgedriver.getTitle();
		System.out.println(title);
		String currenturl=edgedriver.getCurrentUrl();
		String pagesource=edgedriver.getPageSource();
		String windowhandle=edgedriver.getWindowHandle();
		System.out.println(currenturl);
	    System.out.println(pagesource);
	    System.out.println(windowhandle);
	    
	    edgedriver .navigate().to("https://www.healthasyst.com/");
	    edgedriver.navigate().back();
	    edgedriver.navigate().forward();
	    edgedriver.navigate().refresh();
	    edgedriver.manage().window().maximize();
	    edgedriver.manage().window().minimize();
	    edgedriver.manage().window().fullscreen();
	    edgedriver.quit();
	    
	}

}
