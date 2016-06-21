package com.tests;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class DemoQATest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		//launch application
		driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
	}	
	@BeforeTest
	public void beforeTest() {
		//initiate driver
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		//shutdown driver
		driver.quit();			
	}
}
