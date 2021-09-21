package com.basics.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDOwn {

	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(list.size());
		//selectChoice(list,"choice 1");
		//selectChoice(list,"choice 2 3", "choice 6 2 1", "choice 4");
		selectChoice(list, "All");
	}

	private static void selectChoice(List<WebElement> list, String... value) {
		// TODO Auto-generated method stub
		
		if(!value[0].equalsIgnoreCase("All")) {
			for(WebElement items: list) {
				String text = items.getText();
				System.out.println(text+""+value[0]);
				for(String val:value) {
					if(text.equals(val)) {
						items.click();
					}
				}
			}
		}else {
			try {
			for(WebElement items: list) {
				items.click();
			}
			}catch(Exception e) {
				
			}
		}
	}
}
