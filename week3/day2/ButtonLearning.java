package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLearning {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/");
		driver.findElement(By.xpath("//mat-card[@routerlink='/button']//div[1]")).click();
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
		Point location = driver.findElement(By.id("button2")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.id("button3")).getCssValue("background");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.id("button4")).getSize();
		System.out.println(size);
		driver.quit();
	}
}
