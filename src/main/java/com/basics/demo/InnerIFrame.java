package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		
		//driver.switchTo().parentFrame();//switch to parent iframe
		//driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']//div[@class='container']"));
		
		//driver.switchTo().defaultContent();//switch to mainpage
		//driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		
	}

}
