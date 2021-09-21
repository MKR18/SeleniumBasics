package com.basics.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionUsingMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com");
		
		WebElement input1 = driver.findElement(By.id("inputText1"));
		WebElement input2 = driver.findElement(By.id("inputText2"));
		
		
		input1.sendKeys("welcome");
		Actions actions = new Actions(driver);
		
		//CTRL+A   on MAC COMMAND on WIndows CONTROL
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("a");
		actions.keyUp(Keys.COMMAND);
		actions.perform();
		
		//CTRL+C
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("c");
		actions.keyUp(Keys.COMMAND);
		actions.perform();
		
		//TAB
		actions.sendKeys(Keys.TAB);
		actions.perform();
		
		//CTRL+V
		actions.keyDown(Keys.COMMAND);
		actions.sendKeys("v");
		actions.keyUp(Keys.COMMAND);
		actions.perform();
		
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
				System.out.println("Text copied");
		else
			System.out.println("Text not copied");
		
		}

}
