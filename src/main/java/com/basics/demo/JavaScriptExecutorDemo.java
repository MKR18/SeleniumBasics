package com.basics.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
		
		//draw border and capture screenshot
 /*    WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
		JavaScriptUtil.drawBorder(logo, driver);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//screenshots/logo.png");
		
		FileUtils.copyFile(src, target); */
		
		//title of the page
//		String title  = JavaScriptUtil.getTitle(driver);
//		System.out.println(title);
	
		//click action using JAVAScriptexecutor
//		WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
//		JavaScriptUtil.clickElementBYJS(reg, driver);
		
		
		//generate alert
	//	JavaScriptUtil.generateAlert(driver, "this is alert");
		
		//refresh page
	 //  JavaScriptUtil.refreshBrowserByJS(driver);
	   
	   //scroll down
	   //JavaScriptUtil.scrollPageDown(driver);
	   
	   //scroll up
	  // JavaScriptUtil.scrollPageUp(driver);
	   
	   //zoompage
	 //  JavaScriptUtil.zoomPageByJS(driver);
	
	//flash
	   JavaScriptUtil.flash(logo, driver);
	}

}
