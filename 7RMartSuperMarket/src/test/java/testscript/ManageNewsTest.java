package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import page.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(description="testcase is for managing news")

	public void verifyTheUserIsAbleToUpdateManageNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterValidaCredentials(usernamevalue, passwordvalue);
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickManageNewsInfo();
		managenewspage.enterNewUpdate();
		String newsdata = ExcelUtility.getStringData(1, 0, "newspage");
		managenewspage.enterAnyNews(newsdata);
		managenewspage.clickSave();
		boolean homepage = managenewspage.isAlertDisplayed();
		Assert.assertTrue(homepage);

	}
}
