package com.basics.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileWordUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//a[@class='btn block resume-btn btn-orange mt20']")).click();
	//	driver.findElement(By.id("file-upload")).sendKeys("/Users/mkr/Downloads/file-sample_100kB.doc"); //if type= file in html you can use sendkeys method directly
		
		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", button);
	
		
		
		Robot robot = new Robot();
		robot.delay(1000);
		
		//put path to file in a clipboard
		StringSelection ss= new StringSelection("../file-sample_100kB.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		
		
		
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_V);
//         robot.keyRelease(KeyEvent.VK_V);
//         robot.keyRelease(KeyEvent.VK_CONTROL);
//         robot.keyPress(KeyEvent.VK_ENTER);
//         robot.keyRelease(KeyEvent.VK_ENTER);
         
		
		
	}

}
