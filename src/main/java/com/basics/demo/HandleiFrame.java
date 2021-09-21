package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleiFrame {
	
	public static void main(String args[]) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//1) iframe
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	//2)iframe

	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[text()='Capabilities']")).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);

	//3)iframe

		driver.switchTo().frame("classFrame");
		driver.findElement(By.id("search")).click();
		driver.switchTo().defaultContent();
	
	}
}
