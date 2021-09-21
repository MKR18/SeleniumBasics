package com.basics.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		// 1)how to select specific checkbox
		//driver.findElement(By.id("tuesday")).click();
		
		//2)how to select all the checkboxes
	    List<WebElement> allChkList = driver.findElements(By.xpath("//div[@class='form-check']//input[@type='checkbox']"));
		
		//for(WebElement chk : allChkList) {
		//	chk.click();
		//}
		
		//3)how to select multiple checkboxes by choice 	
//		for(WebElement chk : allChkList) {
//			
//			String chkboxName = chk.getAttribute("id");
//			
//			if(chkboxName.equals("sunday") ||  chkboxName.equals("thursday")) {
//				chk.click();
//			}
//			
//		}
		
		//4)how to select last 2 checkboxes
		int totalchkbox = allChkList.size();
		
//		for(int i=totalchkbox-2; i<totalchkbox;i++) {
//			allChkList.get(i).click();
//		}
		
		//5) how to select first 2 checkboxes
		for(int i=0; i<totalchkbox; i++) {
			if(i<2)
			allChkList.get(i).click();
		}
		
	}

}
