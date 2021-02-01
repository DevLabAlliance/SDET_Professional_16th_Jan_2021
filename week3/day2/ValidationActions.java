package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/radiobutton");
		
		// isSelected()
		boolean selected = driver.findElementById("name2").isSelected();
		System.out.println(selected);
		
		// isEnabled()
		driver.get("https://devlabs-860f0.web.app/edit");
		boolean ena = driver.findElementById("clearMe").isEnabled();
		System.out.println(ena);
		
		
		// isDisplayed()
		driver.get("https://devlabs-860f0.web.app/button");
		boolean dis = driver.findElementById("button1").isDisplayed();
		System.out.println(dis);
		
		
		driver.get("http://127.0.0.1:5500/index.html");
		dis = driver.findElementById("two").isDisplayed();
		System.out.println(dis);
		driver.quit();
	}

}
