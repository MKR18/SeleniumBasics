package com.basics.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePlaceAutoCompleteDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.clear();
		
		search.sendKeys("toronto");
		
		String text = null;
		
		do {
			try {
			search.sendKeys(Keys.ARROW_DOWN);
			text = search.getAttribute("value");
			String value = text;
			
			if(value.equals("Toronto, OH, USA")) {
				search.sendKeys(Keys.ENTER);
			}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(""+e.getMessage());
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
		
		driver.quit();
		
		
		
	}

}
