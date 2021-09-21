package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");	
		
		driver.switchTo().frame(0);

		WebElement element = driver.findElement(By.id("age"));
		String tooltip = element.getAttribute("title");
		System.out.println(""+tooltip);
		
	driver.quit();
	}

}
