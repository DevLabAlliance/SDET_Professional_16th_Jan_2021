package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		// to set the driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/");
		driver.quit();
		
		
	}

}
