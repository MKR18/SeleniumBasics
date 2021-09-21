package com.basics.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSlider {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_slider=  driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		WebElement max_slider=  driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		
		System.out.println("location x and y dimensions before draganddropby "+min_slider.getLocation());
		System.out.println("Height and width of element :"+min_slider.getSize());
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(min_slider, 150, 0).build().perform();
		
		
		System.out.println("location x and y dimensions After draganddropby "+min_slider.getLocation());
		System.out.println("Height and width of element :"+min_slider.getSize());
		
		actions.dragAndDropBy(max_slider, -100, 0).perform();
		
		System.out.println("location x and y dimensions After draganddropby "+max_slider.getLocation());
		System.out.println("Height and width of element :"+max_slider.getSize());
	}
	
}
