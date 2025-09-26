package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//div[@class='_3ZeUN+']")).click();
    }
}
