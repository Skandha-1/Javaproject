package com.actionclass;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AutoCompleteTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jqueryui.com/autocomplete/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("demo-frame"))));

        driver.findElement(By.id("tags")).sendKeys("b");

        WebElement element = driver.findElement(By.id("ui-id-1"));
        wait.until(ExpectedConditions.visibilityOf(element));

        List<WebElement> list = driver.findElements(By.className("ui-menu-item"));
        int size_list = list.size();
        System.out.println(size_list);

        for (int i = 0; i < size_list; i++) {
            String text = list.get(i).getText();
            if (text.contentEquals("BASIC")) {
                list.get(i).click();
                break;
            }
        }

        driver.close();
    }
}