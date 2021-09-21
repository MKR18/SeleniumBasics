package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttributeVsgetText {
	
	//getText() captures inner element of the html element or text field
	//getAttribute(Attribute) captures the s=attribute value of the html element that you pass in parameter
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com");
			
			WebElement  btn = driver.findElement(By.cssSelector("div[class=\"home-banner-button\"] a[class^='btn blue-button']"));
			
			//get
			System.out.println(btn.getText());
			System.out.println(btn.getAttribute("class"));
			
		
			driver.quit();
	}
}
