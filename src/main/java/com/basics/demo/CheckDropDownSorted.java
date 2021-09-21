package com.basics.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement drp = driver.findElement(By.xpath("//select[@name='category_id']"));
		
		
		List<String>  originalList = new ArrayList<String>();
		List<String>    tempList = new ArrayList<String>();
		
		Select list = new Select(drp);
		List<WebElement> optList = list.getOptions();
		
		
		for(WebElement opt:optList) {
			System.out.println(""+opt);
			originalList.add(opt.getText());
			tempList.add(opt.getText());
		}
		
		System.out.println("original list"+originalList.size());
		System.out.println("temp list"+ tempList.size());
		
		Collections.sort(tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("Sorted drop down");
		}else {
			System.out.println("unsorted drop down");
		}
		
		driver.quit();
		
	}

}
