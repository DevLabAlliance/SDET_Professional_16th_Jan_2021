package tests;

import org.testng.annotations.Test;

import PreAndPostServiceNow.ServiceNowBase;
import serviceNow.pages.HomePage;
import serviceNow.pages.LoginPage;

public class TC001_Login extends ServiceNowBase{


	@Test
	public void loginIntoServiceNow() {

		new LoginPage()
		.enterUserName("admin")
		.enterPassword("JKaHY8lub4pL")
		.clickLoginButton();

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
