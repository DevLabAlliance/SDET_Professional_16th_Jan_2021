package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement elec = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(elec).perform();
		WebElement tablets = driver.findElementByLinkText("Tablets");
		act.moveToElement(tablets).perform();
		driver.findElementByLinkText("All").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("aaa"));
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Tablets")) {
			System.out.println("Pass");
		}else System.err.println("fail");
	}

}
