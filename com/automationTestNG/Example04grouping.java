package com.automationTestNG;

import org.testng.annotations.Test;

public class Example04grouping {
  @Test(groups = {"smoke"})
  public void smokeTest1() {
	  System.out.println("Smoke Test 1");
  }
  @Test(groups= {"smoke"})
  public void smokeTest2() {
	  System.out.println("Smoke Test 2");
  }
  @Test(groups= {"regression"})
  
  public void regressionTest() {
	  System.out.println("Regression Test ");
  }
}
