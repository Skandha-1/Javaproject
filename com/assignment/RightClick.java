package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement button = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));

        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();
        WebElement contextMenu = driver.findElement(By.cssSelector(".context-menu-list"));
        if (contextMenu.isDisplayed()) {
            System.out.println("Context menu is displayed after right-click.");
        } else {
            System.out.println("Context menu is NOT displayed.");
        }

        driver.quit();
    }
}