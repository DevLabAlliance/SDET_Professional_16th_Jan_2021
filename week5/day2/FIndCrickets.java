package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndCrickets {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElementByName("q").sendKeys("cricket"
				, Keys.ENTER);
		List<WebElement> words = 
				driver.findElementsByXPath
				("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
		System.out.println(words.size());
		driver.quit();
	}

}
