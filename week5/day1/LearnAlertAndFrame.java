package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertAndFrame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String data= "koushik";
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		String text = driver.findElementById("demo").getText();
		if(text.contains(data)) {
			System.out.println("Pass");
		}else System.out.println("faile");
		driver.quit();
		
		
		
		
		
//		
		
	}

}
