package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementNFindelements {

	//note: findelement returns first element matching on the page  and if element not founf it throws nosuchelementexception
	// findelements: returns all the elements matching on the page if not found it wont throw any error
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.nopcommerce.com");
			
//			WebElement firstLink = driver.findElement(By.xpath("//div[@class='footer-upper']//li"));
//			firstLink.click();
			
			List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
			
			for(WebElement link:allLinks) {
				System.out.println(link.getAttribute("href"));
			}
			
			
		
			driver.quit();
	}

}


