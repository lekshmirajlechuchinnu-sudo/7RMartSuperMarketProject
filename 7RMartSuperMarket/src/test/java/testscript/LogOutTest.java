package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.HomePage;
import page.LogOutPage;
import page.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base{
	HomePage homepage;
	LogOutPage logoutpage;
	
	
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"},description="testcase is for checking logout successfully")
	
	
	public void verifyTheUserIsAbleToLogOutSuccessfullyFromDashboard() throws IOException {

		// String passwordvalue = "admin";
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		logoutpage.clickAdmin();
		//loginpage.enterSignIn();
		homepage=logoutpage.clickLogout();
		boolean homepage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(homepage);
		//HomePage logoutpage = new HomePage(driver);
		

	}

}



