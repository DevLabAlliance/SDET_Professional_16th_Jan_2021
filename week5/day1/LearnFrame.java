package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/frame");
		driver.switchTo().frame(1);
		// id or the name locator value
		//		driver.switchTo().frame("myframe");
		//		driver.switchTo().frame("loginFrame");
		WebElement frame = driver.findElementByXPath("//iframe[@src='/login']");
		//		driver.switchTo().frame(frame);
		//		driver.switchTo().parentFrame();
		//		driver.switchTo().defaultContent();

		driver.findElementById("username").sendKeys("admin");
		Thread.sleep(5000);
		driver.quit();
	}
}
