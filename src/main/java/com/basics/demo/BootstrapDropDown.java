package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='drp1']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println(products.size());
		
		
		for(WebElement ptype:products) {
			if(ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='drp2']")).click();
		List<WebElement> personalLoan = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println(personalLoan.size());
		
		for(WebElement Loantype:personalLoan) {
			if(Loantype.getText().equals("Savings Accounts")) {
				Loantype.click();
				break;
			}
		}
		
		driver.quit();
	}

}
