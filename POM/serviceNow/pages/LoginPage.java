package serviceNow.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PreAndPostServiceNow.ServiceNowBase;

public class LoginPage extends ServiceNowBase{

	// find all the elements
	// store it in class, properties

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id="user_name") private WebElement eleuserName;

	
	@FindBy(id="user_password") private WebElement elePass;

	@CacheLookup
	@FindBy(xpath = "//*[@id='sysverb_login']")
	private WebElement loginBtn;
	
	/*
	 * String name = "admin";
	 * 
	 * @FindBy(xpath = "//*[text()='Welcome "+name+"']") private WebElement welc;
	 */


	// enter the username
	// enter the password
	// click on the login btn


	public LoginPage enterUserName(String name) {
		driver.switchTo().frame("gsft_main");
		//		driver.findElementById("user_name")
		//		.sendKeys(name);
		this.eleuserName.sendKeys(name);
		return this;
	}

	public LoginPage enterPassword(String password) {
		this.elePass.sendKeys(password);
		//		driver.findElementById("user_password")
		//			.sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {
		this.loginBtn.click();
		//		driver.findElementByXPath("//*[@id='sysverb_login']").click();
		HomePage hp = new HomePage();
		return hp;
		// return new HomePage();
	}
	
	
}
