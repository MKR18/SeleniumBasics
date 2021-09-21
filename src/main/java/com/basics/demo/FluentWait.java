package com.basics.demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		 By elementLocator = By.xpath("//h3[text()='Selenium']");
		
		
//				Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)							
//				.withTimeout(Duration.ofSeconds(30)) 			
//				.pollingEvery(Duration.ofSeconds(5)) 			
//				.ignoring(NoSuchElementException.class);
//				
//		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//		
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(elementLocator);
//						}
//		});
//		clickseleniumlink.click();
		
		//Generic/reuseable method
		fluentGenericCall(driver, elementLocator, 30, 5).click();
	}

	private static WebElement fluentGenericCall(WebDriver driver,  final By elementLocator, int timeout, int pollingTIme) {
		// TODO Auto-generated method stub

		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)							
		.withTimeout(Duration.ofSeconds(30)) 			
		.pollingEvery(Duration.ofSeconds(5)) 			
		.ignoring(NoSuchElementException.class);
		
WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

	public WebElement apply(WebDriver driver ) {
		return driver.findElement(elementLocator);
				}
});

return driver.findElement(elementLocator);
	}
	}


