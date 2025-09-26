package com.automationTestNG;

import org.testng.annotations.Test;

public class Example05GroupingTestNg {
  @Test(groups = {"smoke"})
  public void smokeTest3() {
	  System.out.println("Smoke Test 3");
  }
  @Test(groups= {"smoke"})
  public void smokeTest4() {
	  System.out.println("Smoke Test 4");
  }
  @Test(groups= {"regression"})
  
  public void regressionTest1() {
	  System.out.println("Regression Test 1");
  }
}
