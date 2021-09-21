package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");	
		
		
	     driver.findElement(By.xpath("//span[@class='ico-user sprite-image']")).click();
	     
	     String tab = Keys.chord(Keys.COMMAND, Keys.RETURN);
		 driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(tab);
		
		 
		// driver.quit();
	}

}
