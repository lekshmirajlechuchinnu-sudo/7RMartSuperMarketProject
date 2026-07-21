package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.AdminPage;
import page.HomePage;
import page.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends Base {
	HomePage homepage;
	AdminPage adminpage;
	@Test(retryAnalyzer=retry.Retry.class,description="testcase is for entering data to admin page")
	

	public void verifyTheUserIsAbleToAddNewItemInAdminUsersPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		//AdminPage adminpage = new AdminPage(driver);
		adminpage=homepage.clickAdminPageMoreInfo();
		//adminpage.enterNewTab();
		//String usernamevalue1 = ExcelUtility.getStringData(1, 0, "adminpage");
		//String passwordvalue1 = ExcelUtility.getStringData(1, 1, "adminpage");
		String value = ExcelUtility.getStringData(1, 2, "adminpage");
		FakerUtility faker=new FakerUtility();
		String usernamevalue1=faker.generateCategory();
		String passwordvalue1=faker.generateCategory();
		adminpage.enterNewTab().enterAdminUsersCredentials(usernamevalue1, passwordvalue1, value).clickSave();
		//adminpage.clickSave();
		boolean homepage = adminpage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.ENTERVALUEADMINPAGE);

	}

}
