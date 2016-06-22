package com.tests;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
public class AntDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//initiate driver
	    driver = new FirefoxDriver();
		//launch application
	    driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
		//shutdown driver
		driver.quit();
	}

}
