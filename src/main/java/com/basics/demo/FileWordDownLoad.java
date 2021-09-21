package com.basics.demo;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileWordDownLoad {

	
	public static void main(String args[]) {
		String location = System.getProperty("user.dir")+"/downloads/";	
		
		//chromedriver
		HashMap<String, String> prefernces = new HashMap<String, String>();
		prefernces.put("download.default_directory", location);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefernces);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
		
		
		//edge driver
//		HashMap<String, String> prefernces = new HashMap<String, String>();
//		prefernces.put("download.default-directory", location);
//		
//		EdgeOptions options = new EdgeOptions();
//		options.setExperimentalOption("pref", prefernces);
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
//		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
		
		//gecko driver or firefox driver
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");//mime type
//		profile.setPreference("browser.download.folderList", 2);//0-desktop, 1-download, 2-specific loaction
//		profile.setPreference("browser.dowload.dir", location);
//		
//		FirefoxOptions options = new FirefoxOptions();
//		options.setProfile(profile);
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver(options);
//		
//		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
//		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
//		
		
	}
}
