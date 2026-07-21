package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.HomePage;
import page.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	HomePage homepage;
	
@Test(description="testcase is for loging in to webpage")


public void verifyTheUserIsAbleToLoginValidCredentials() throws IOException {
		// String usernamevalue = "admin";
		// String passwordvalue = "admin";
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		boolean assertmessage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(assertmessage,Constant.LOGINVALIDCREDENTIALS);
		


	}

	@Test

	public void verifyTheUserIsAbleToLoginIncorrectUserNameAndValidPassword() throws IOException {
		// String usernamevalue = "hello";
		// String passwordvalue = "admin";
		String usernamevalue = ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).enterSignIn();
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterUserName(usernamevalue);
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterSignIn();
		boolean assertmessage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(assertmessage,Constant.LOGININVALIDCREDENTIALS);
	}

	@Test

	public void verifyTheUserIsAbleToLoginCorrectUserNameAndInValidPassword() throws IOException {
		// String usernamevalue = "admin";
		// String passwordvalue = "hello@123";
		String usernamevalue = ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).enterSignIn();
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterUserName(usernamevalue);
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterSignIn();
		boolean assertmessage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(assertmessage,Constant.LOGININVALIDCREDENTIALS);
	}

	@Test

	public void verifyTheUserIsAbleToLoginInValidCredentials() throws IOException {
		// String usernamevalue = "hello";
		// String passwordvalue = "hello@123";
		String usernamevalue = ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).enterSignIn();
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterUserName(usernamevalue);
		//loginpage.enterPassword(passwordvalue);
		//loginpage.enterSignIn();
		boolean assertmessage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(assertmessage,Constant.LOGININVALIDCREDENTIALS);
	}
}


