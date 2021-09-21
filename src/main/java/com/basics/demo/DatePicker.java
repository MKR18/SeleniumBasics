package com.basics.demo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		/*driver.get("http://www.redbus.in");
		
		
		String date = "18";
		String month = "Oct";
		String year = "2022";
		
		driver.findElement(By.id("onward_cal")).click();
		
		
		
		//to get expected month and year
		while(true) {
			String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[] = monthYear.split(" ");
			String currentMonth = arr[0];
			String currentYear = arr[1];
			
			if(currentMonth.equals(month) && currentYear.equals(year)) 
				break;
			else
				driver.findElement(By.xpath("//tr[@class='rb-monthHeader']//td[@class='next']")).click();
				
		}
		
		//to get expected date
		List<WebElement> datelist = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		 
		for(WebElement date1:datelist) {
			System.out.println(date1.getText());
			if(date.equals(date1.getText())) {
			date1.click();
			break;
			}
		}
		*/
		
		
		
		//next type date picker
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.id("appoinmentdate")).click();
		
		Select selectmonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
		selectmonth.selectByVisibleText("Oct");
		
		Select selectYear = new Select(driver.findElement(By.className("ui-datepicker-year")));
		selectYear.selectByVisibleText("2022");
		
		List<WebElement> dateList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		String date = "18";
		for(WebElement ele  :dateList) {
			if(date.equals(ele.getText())) {
				ele.click();
				break;
			}
				
		}
	
	}
}

