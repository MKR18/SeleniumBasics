package com.basics.demo;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.nopcommerce.com/en/demo");

	//to get all cookies
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	
	//how to print cookies from browser
	for(Cookie cookie:allCookies) {
		System.out.println(cookie.getName() + " : "+cookie.getValue());
	}
	
	//How to add cookie to the browser
	Cookie cookieObj =   new Cookie("MYCookie123", "123456");
	driver.manage().addCookie(cookieObj);
	
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	
	
	
	//delete cookie 
	//driver.manage().deleteCookie(cookieObj);
	driver.manage().deleteCookieNamed("MYCookie123");
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	
	
	//delete all cookies
	driver.manage().deleteAllCookies();
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	
	
	driver.quit();
	
}

}
