package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJS {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://devlabs-860f0.web.app/edit");
		WebElement text = driver.findElementByXPath("(//input[@type='name'])[1]");
		// sendKeys
		Object executeScript = driver.executeScript("return arguments[0].getAttribute('placeholder')", text);
		System.out.println(executeScript);
		// click
		WebElement img = driver.findElementByXPath("//img[@alt='home']");
		driver.executeScript("arguments[0].click()", img);
		// getText
		driver.navigate().back();
		WebElement header = driver.findElementByTagName("h1");
		Object txt = driver.executeScript("return arguments[0].textContent", header);
		System.out.println(txt);

		// getAttribute





	}

}
