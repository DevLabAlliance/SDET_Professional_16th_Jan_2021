package week3.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCalculator {
	public static void main(String[] args) {
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
	}

}
