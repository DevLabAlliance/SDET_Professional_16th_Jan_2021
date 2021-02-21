package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import devLabsSpecific.ProjectSpecific;

public class EditLearning extends ProjectSpecific{
	
	@DataProvider(name="EditTest")
	public String[][] getData() {
		String[][] data = new String[3][2];
		// read the data from excel
		data[0][0] = "koushik";
		data[0][1] = "c";
		data[1][0] = "Santhosh";
		data[1][1] = "Santhosh";
		data[2][0] = "Jim";
		data[2][1] = "J";
		return data;
	}
	
	@Test(dataProvider = "EditTest")
	public void editTest(String name, String lname) {
		driver.findElement(By.xpath("//mat-card[@routerlink='/edit']//div[1]")).click();
		String text = driver.findElementByTagName("h1").getText();
		System.out.println(text);
		WebElement names = driver.findElementById("fullName");
		System.out.println(names.getAttribute("placeholder"));
		names.sendKeys(name + " -- " + lname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement append = driver.findElementById("join");
		append.clear();
		append.sendKeys(" person", Keys.TAB);
		String vlue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(vlue);
		}
}
