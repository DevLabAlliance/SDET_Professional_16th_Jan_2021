package week6.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateCalculator {
	
	@Test(invocationCount = 3, threadPoolSize = 2, description = "This will add 2 numbers")
	public void calc() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		WebElement firstNum = driver.findElementById("number1Field");
		firstNum.sendKeys("45");
		driver.findElementByName("number2").sendKeys("54");
		driver.findElementById("calculateButton").click();
		String resultValue = driver.findElementByName("numberAnswer").getAttribute("value");
		System.out.println(resultValue);
		driver.quit();
	}

}
