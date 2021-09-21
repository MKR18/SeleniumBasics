package com.basics.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserWindow {

//			1) How To Handle Browser Windows in Selenium WebDriver?
//			2) What is the Difference between getWindowHandle() & getWindowHandles() methods?
//			3) How To Switch between Multiple Browser Windows?
//			4) What is the difference between close() and quite() methods?
//			5) How to close All browser Windows?
//			6) How To close Specific Browser Window by choice?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle():String
		//getWindowHandles() :set<String>
		
		String windowId = driver.getWindowHandle();
		System.out.println("parentWindowId"+windowId);
		 
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Set<String> windowIds = driver.getWindowHandles();
		
		//1)method = iterator
		
//		Iterator<String> iterator = windowIds.iterator();
//		
//		String parentwindowid = iterator.next();
//		String childWindowId = iterator.next();
//		
//		System.out.println(parentwindowid+" parent and child window ids"+childWindowId);
//		
		//2)method = list/arraylist
		List<String> list = new ArrayList<String>(windowIds);
		
//		for(String win : list) {
//			System.out.println(""+win);
//			String title = driver.switchTo().window(win).getTitle();
//			System.out.println(title);
//		}
		
//		String parentWindowId = list.get(0);
//		String childWindowId = list.get(1);
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(childWindowId);
//		System.out.println(driver.getTitle());
		
		//driver.close();//closes curent browser window
		//driver.quit();// closes all browser windows
		
		//To close specific window in the browser
		for(String win : list) {
			 String title = driver.switchTo().window(win).getTitle();
			if(title.equals("OrangeHRM") || title.equals( "other title")) {
				driver.close();
			}
		}
	}

}
