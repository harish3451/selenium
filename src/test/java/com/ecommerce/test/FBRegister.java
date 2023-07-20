package com.ecommerce.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FBRegister {
	
	public String baseUrl="file:///D:/eclipse/Mphasis/phase5/hello-selenuim/src/main/resources/test.html";
	private WebDriver driver;
	
  @Test()
  public void f() {
	  System.out.println("Inside test");
//	  WebElement selectMonthElement = driver.findElement(By.id("month"));
//		Select selectMonth = new Select(selectMonthElement);
//		
//		System.out.println("is this mutliple select = " + selectMonth.isMultiple());
//		selectMonth.selectByIndex(0);
//		selectMonth.selectByIndex(6);
//List<WebElement> optionsList = selectMonth.getAllSelectedOptions();
//		
//		for(WebElement option : optionsList)
//		System.out.println("selectMonth selected options are " + option.getText());
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Inside before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside After method");
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside before Suite");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside after suite");
	  driver.quit();
  }

}
