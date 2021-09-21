package com.basics.demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		actions.sendKeys(Keys.RETURN).perform();
		Thread.sleep(5000);

		actions.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(5000);

		actions.sendKeys(Keys.SPACE).perform();
		Thread.sleep(5000);

		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);

		actions.sendKeys(Keys.ENTER).perform();

		
	}

}
