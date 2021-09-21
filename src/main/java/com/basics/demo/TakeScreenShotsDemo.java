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

public class TakeScreenShotsDemo {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		
		//full page
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(".//screenshots/fullpage.png");
//		FileUtils.copyFile(src, target);
		
		//portion of the page
//		WebElement somePortion =  driver.findElement(By.xpath("//div[@class='needhelp-content-section']"));
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = somePortion.getScreenshotAs(OutputType.FILE);
//		File target =  new File(".//screenshots/portion.png");
//		FileUtils.copyFile(src, target);
		
		//on element
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File target =  new File(".//screenshots/logoss.png");
		FileUtils.copyFile(src, target);
		
		driver.quit();
	}
}
