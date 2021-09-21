package com.basics.demo;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("pen");
		search.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://amazon.com");
		
		driver.quit();
	}

}
