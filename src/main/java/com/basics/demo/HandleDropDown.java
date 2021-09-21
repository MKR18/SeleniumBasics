package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drp = driver.findElement(By.id("input-country"));
		
		//Select opt = new Select(drp);
		
		//opt.selectByVisibleText("India");
		//opt.selectByIndex(2);
		//opt.selectByValue("3");
		
		
		//selecting options without using methods
		
//		List<WebElement> allCountry = opt.getOptions();
//		 System.out.println(allCountry.size());
//		 for(WebElement country : allCountry) {
//			 System.out.println(country.toString());
//			 if(country.getText().equals("India")) {
//				 country.click();
//			 	 break;
//			 }
//		 }
		
		
		multipleDropDown(drp, "India");
		driver.quit();
	}
	
	

	private static void multipleDropDown(WebElement element, String value) {
		// TODO Auto-generated method stub
		Select opt = new Select(element);
		
		//selecting options without using methods
				List<WebElement> allCountry = opt.getOptions();
				 System.out.println(allCountry.size());
				 for(WebElement country : allCountry) {
					 System.out.println(country.toString());
					 if(country.getText().equals(value)) {
						 country.click();
					 	 break;
					 }
				 }
	}
}
