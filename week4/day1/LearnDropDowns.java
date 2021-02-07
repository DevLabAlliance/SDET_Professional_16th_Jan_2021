package com.devlabs.selenium.lab2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDowns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); // Open the browser
	driver.manage().window().maximize(); // To maximize the browser
	driver.get("https://devlabs-860f0.web.app/dropdown"); // Post the URL in the browser
	
	WebElement elementDropDown = driver.findElement(By.id("Index")); // Finding the dropdown element
	
	// Type - 1 -> using sendKeys -> elementDropDown.sendKeys("Apple");
	
	// Type - 2 -> using Select class
	
	Select dd1 = new Select(elementDropDown);
	
	// Type - 2.1 -> using index -> dd1.selectByIndex(2);
	
	// Type - 2.2 -> using visible text -> dd1.selectByVisibleText("Orange");
	
	// Type - 2.3 -> using value -> dd1.selectByValue("2");
	
	// Getting all the options from the drop down
	List<WebElement> options = dd1.getOptions();
	System.out.println(options.size());
	
	for (WebElement eachOption : options) {
		System.out.println(eachOption.getText());
	}
	// Get the default option selected in the drop down
	WebElement firstSelectedOption = dd1.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	
	
	
	
	
	
	
	
	
	

}
}
