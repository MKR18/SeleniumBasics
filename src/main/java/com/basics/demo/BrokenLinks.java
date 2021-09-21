package com.basics.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		int brokenlink =0;
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		for(WebElement element:links) {
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			
			
			

			try {
			URL link = new URL(url);
			
			HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
			httpconnect.connect();
			
			if(httpconnect.getResponseCode()>=400) {
				System.out.println("Broken link "+url+ httpconnect.getResponseCode());
				brokenlink++;
			}else {
				System.out.println("valid link "+url+ httpconnect.getResponseCode());

			}
			
			} catch (Exception e) {
				
			}
			
		}
		
		System.out.println("number of broken links"+brokenlink);
		
	}
	
	public static int verifyLinkActive(String linkUrl,int  brokenlink)
    {
		
		try {
			
			
			 URL url = new URL(linkUrl);           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();           
	          // httpURLConnect.setConnectTimeout(3000);
	           httpURLConnect.connect();
	           
			

		
		if(httpURLConnect.getResponseCode()>=400) {
			System.out.println("Broken link "+url+ httpURLConnect.getResponseCode());
		
			brokenlink++;
		}else {
			System.out.println("valid link "+url+ httpURLConnect.getResponseCode());

		}
		
		} catch (Exception e) {
		
			
		}
		return brokenlink;
    } 

}
