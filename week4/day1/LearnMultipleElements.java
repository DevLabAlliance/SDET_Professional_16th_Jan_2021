package com.devlabs.selenium.lab2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); // Open the browser
	driver.manage().window().maximize(); // To maximize the browser
	driver.get("https://www.amazon.in/"); // Post the URL in the browser
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 8 Pro",Keys.ENTER);
	// Common locator for identical elements
	List<WebElement> elementsMobileName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement eachElement : elementsMobileName) {
		System.out.println(eachElement.getText());
	}






}
}
