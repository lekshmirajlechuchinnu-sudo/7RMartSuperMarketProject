package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.HomePage;
import page.LoginPage;
import page.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
   HomePage	homepage;
   ManageNewsPage managenewspage;
	@Test(retryAnalyzer=retry.Retry.class,description="testcase is for managing news")

	public void verifyTheUserIsAbleToUpdateManageNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		//ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage=homepage.clickManageNewsInfo();
		String newsdata = ExcelUtility.getStringData(1, 0, "newspage");
		managenewspage.enterNewUpdate().enterAnyNews(newsdata).clickSave();
		//managenewspage.enterAnyNews(newsdata);
		//managenewspage.clickSave();
		boolean homepage = managenewspage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.ENTERVALUEMANAGENEWS);

	}
}
