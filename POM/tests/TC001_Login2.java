package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PreAndPostServiceNow.ServiceNowBase;
import serviceNow.pages.HomePage;
import serviceNow.pages.LoginPage;

public class TC001_Login2 extends ServiceNowBase{

	// tcoo2data
	
	
	@BeforeTest
	public void setData() {
			excelFileName = "tcoo2data";
	}
	
	@Test
	public void loginIntoServiceNow() {

		new LoginPage()
		.enterUserName("admin")
		.enterPassword("JKaHY8lub4pL")
		.clickLoginButton()
		.welcome("admin");

		new HomePage()
		.validateCreateDBversion()
		.verifyTitle();





		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName("admin");
		 * lp.enterPassword("JKaHY8lub4pL"); lp.clickLoginButton();
		 * 
		 * HomePage hp = new HomePage(); hp.validateCreateDBversion(); hp.verifyTitle();
		 */	
	}

}
