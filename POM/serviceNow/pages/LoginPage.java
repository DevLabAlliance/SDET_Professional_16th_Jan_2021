package serviceNow.pages;

import PreAndPostServiceNow.ServiceNowBase;

public class LoginPage extends ServiceNowBase{

	// enter the username
	// enter the password
	// click on the login btn


	public LoginPage enterUserName(String name) {
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name")
		.sendKeys(name);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElementById("user_password")
			.sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElementById("sysverb_login").click();
		HomePage hp = new HomePage();
		return hp;
		// return new HomePage();
	}

}
