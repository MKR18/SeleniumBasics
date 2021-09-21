package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToParentIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
	
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		
		WebElement innerElement = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(innerElement);
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		
	}
	

}
