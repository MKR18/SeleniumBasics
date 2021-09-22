package com.basics.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstDemo {

	
	public static void testmain() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mkr/Documents/Documents – monisha’s MacBook Air/jarfiles/chromedriver");
	  // WebDriverManager.chromedriver().setup();	
	 	WebDriver driver = new ChromeDriver();
	   
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
	    System.out.println(driver.getCurrentUrl());
	 //   System.out.println(driver.getPageSource());
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getClass());
	    System.out.println(driver.getWindowHandle());

	    
	    driver.quit();
	}

}
