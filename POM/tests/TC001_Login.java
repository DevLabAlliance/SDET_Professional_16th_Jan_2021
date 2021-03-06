package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PreAndPostServiceNow.ServiceNowBase;
import serviceNow.pages.HomePage;
import serviceNow.pages.LoginPage;

public class TC001_Login extends ServiceNowBase{

	// tcoo1data
	@BeforeTest
	public void setData() {
			excelFileName = "TC001Data";
	}
	

	@Test(dataProvider = "data")
	public void loginIntoServiceNow(String user, String pass) {

		new LoginPage()
		.enterUserName(user)
		.enterPassword(pass)
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
