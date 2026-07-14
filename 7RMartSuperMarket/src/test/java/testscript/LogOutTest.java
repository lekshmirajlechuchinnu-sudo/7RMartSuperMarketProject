package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LogOutPage;
import page.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base{
	
	@Test
	
	
	public void verifyTheUserIsAbleToLogOutSuccessfullyFromDashboard() throws IOException {

		// String passwordvalue = "admin";
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.enterSignIn();
		boolean homepage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(homepage);
		LogOutPage logoutpage = new LogOutPage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();

	}

}



