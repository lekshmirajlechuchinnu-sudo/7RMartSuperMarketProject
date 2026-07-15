package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminPage;
import page.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends Base {

	@Test(description="testcase is for entering data to admin page")

	public void verifyTheUserIsAbleToAddNewItemInAdminUsersPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterValidaCredentials(usernamevalue, passwordvalue);
		AdminPage adminpageusers = new AdminPage(driver);
		adminpageusers.clickAdminPageMoreInfo();
		adminpageusers.enterNewTab();
		//String usernamevalue1 = ExcelUtility.getStringData(1, 0, "adminpage");
		//String passwordvalue1 = ExcelUtility.getStringData(1, 1, "adminpage");
		String value = ExcelUtility.getStringData(1, 2, "adminpage");
		FakerUtility faker=new FakerUtility();
		String usernamevalue1=faker.generateCategory();
		String passwordvalue1=faker.generateCategory();
		adminpageusers.enterAdminUsersCredentials(usernamevalue1, passwordvalue1, value);
		adminpageusers.clickSave();
		//boolean homepage = adminpageusers.isAlertDisplayed();
		//Assert.assertTrue(homepage);

	}

}
