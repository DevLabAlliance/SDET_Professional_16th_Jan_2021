package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/alert");
//		driver.findElementByName("qawse").click();
//		System.out.println(driver.getTitle());
		String text = driver.switchTo().alert().getText();
		System.out.println("Simple alert text: "+text);
//		driver.switchTo().alert().dismiss();
		
		
//		driver.findElementByName("aswdefr").click();
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("koushik");
//		alert.accept();
		driver.quit();
		
	}

}
