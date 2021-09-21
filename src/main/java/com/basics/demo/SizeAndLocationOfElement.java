package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']"));
		
		//method1
		System.out.println("Location(x,y)"+logo.getLocation());
		System.out.println("Location(x,y)"+logo.getLocation().getX());
		System.out.println("Location(x,y)"+logo.getLocation().getY());
		
		//method2
		System.out.println("Location(x,y)"+logo.getRect().getX());
		System.out.println("Location(x,y)"+logo.getRect().getY());
		
		//to get size of element method1
		System.out.println("Size(width,height)"+logo.getSize());
		System.out.println("Size(width,height)"+logo.getSize().getWidth());
		System.out.println("Size(width,height)"+logo.getSize().getHeight());


		//to get size of element method2
		System.out.println("Size(width,height)"+logo.getRect().getDimension().getWidth());
		System.out.println("Size(width,height)"+logo.getRect().getDimension().getHeight());

		driver.quit();
	}

}
