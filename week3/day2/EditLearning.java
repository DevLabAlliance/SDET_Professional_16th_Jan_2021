package week3.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLearning {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/edit");
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
//		WebElement names = driver.findElementById("fullName");
//		System.out.println(names.getAttribute("placeholder"));
//		names.sendKeys("Koushik Chatterjee");
//		WebElement append = driver.findElementById("join");
//		append.clear();
//		append.sendKeys(" person", Keys.TAB);
//		String vlue = driver.findElementById("getMe").getAttribute("value");
//		System.out.println(vlue);
		driver.quit();
	}
}
