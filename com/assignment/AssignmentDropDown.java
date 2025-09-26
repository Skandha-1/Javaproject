package com.assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.findElement(By.name("username")).sendKeys("Skandha Jain");
		driver.findElement(By.name("password")).sendKeys("Abc@123");
        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:/Users/Dell/Desktop/Assignment1.txt");
		
   
        List<WebElement> checkboxes=driver.findElements(By.name("checkboxes[]"));
        System.out.println(checkboxes.size());

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb3']"));
        checkbox1.click();
        
  

        for (WebElement checkbox : checkboxes) {
            String value = checkbox.getAttribute("value");
            if (value.equals("cb1")) {
                System.out.println("Checkbox 1 is selected");
            }}
        List<WebElement> radioval = driver.findElements(By.name("radioval"));
        System.out.println(radioval.size());
        WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='rd1']"));
        WebElement radiobutton2 = driver.findElement(By.xpath("//input[@value='rd2']"));
        WebElement radiobutton3 = driver.findElement(By.xpath("//input[@value='rd3']"));

        radiobutton2.click();
        
        for (WebElement radio : radioval) {
            String value1= radio.getAttribute("value");
            if (value1.equals("rd2")) {
                System.out.println("radio2 is selected");
            }
        }
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Drop Down Item 5");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.findElement(By.xpath("//*[@id=\"back_to_form\"]")).click();
 		
	}}