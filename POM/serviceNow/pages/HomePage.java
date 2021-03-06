package serviceNow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PreAndPostServiceNow.ServiceNowBase;

public class HomePage extends ServiceNowBase{
	
	public void verifyTitle() {
		System.out.println(driver.getTitle());
	}
	
	public HomePage validateCreateDBversion() {
		driver.switchTo().frame("gsft_main");
		WebElement btn = driver.findElementByXPath
				("//button[@aria-label='Create dashboard version of this homepage']");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(btn));
		if(btn.isDisplayed()) {
			System.out.println("Pass");
		}else System.out.println("fail");
		return this;
		
	}

}
