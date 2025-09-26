package com.automationTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Example01AnnotationExample {
  @Test
  public void testMethod() {
	  System.out.println("Test Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod :Runs before <method> tag in method");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod :Runs after ");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass :Runs before class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass :Runs aferter the class");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest :Runs before <test> tag in testng.xml");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest:runs after <test> tag in testing.xml");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite : Runs first before the entire suite starts");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite : Runs last after the entire suite ends");

  }

}
