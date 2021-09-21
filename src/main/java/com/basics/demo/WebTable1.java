package com.basics.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int cols = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody//th")).size();
		int rows = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr")).size();
		
		System.out.println("total rows"+rows);	
		System.out.println("total clolumns"+cols);

		String value = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr[3]/td[1]")).getText();
		
		System.out.println(value);
		
		//to obtain all data from table
		/*for(int r=2;r<rows; r++) {
			for(int c=1; c<=cols; c++) {
				String data = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"
						+ "//tbody/tr["+r+"]/td["+c+"]")).getText();
				//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr[2]/td[2]
				System.out.println(" "+data+"  ");
			}
					System.out.println();

		}*/
		
		
		//to obtain specific data from specific columns of a row example obtain from a given country name UK its company and contact
			for(int r=2; r<rows; r++) {
				String countryName =  driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr["+r+"]/td[3]")).getText();
				
				if(countryName.equals("Canada")){
				String companyName =driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr["+r+"]/td[1]")).getText();
				String  contactName =driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tbody/tr["+r+"]/td[2]")).getText();
				System.out.println(countryName+" companyName: "+companyName+"  "+"ContactName :"+contactName);
			}
			}
	}
	
	

}
