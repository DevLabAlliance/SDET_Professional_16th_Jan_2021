package week3.day2;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigation nav = driver.navigate();
		nav.to("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		if(driver.getTitle().equals("Basic Calculator")) {
			System.out.println("I m in calculator");
		}else{
			System.out.println("wrong");
		}
		driver.get("https://devlabs-860f0.web.app/");
		String devTitle = driver.getTitle();
		String expectedTitle = "Workspace";
		if(devTitle.equals(expectedTitle)) {
			System.out.println("Passed");
		}else System.out.println("fail");
		nav.back();
		nav.refresh();
		driver.navigate().forward();
		driver.quit();
	}

}
