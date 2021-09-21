package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in/");
		
		//driver.findElement(By.linkText("Amazon Pay")).click();
		driver.findElement(By.partialLinkText("Amazon")).click();
		
		//how to get all links
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		for(WebElement link:linklist) {
			System.out.println(link.getAttribute("href"));
		}
		
		
	}

}
