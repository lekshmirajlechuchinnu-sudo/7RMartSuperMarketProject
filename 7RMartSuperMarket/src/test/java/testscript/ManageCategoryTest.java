package testscript;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.HomePage;
import page.LoginPage;
import page.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategoeypage;
	@Test(retryAnalyzer=retry.Retry.class,description="testcase is for managing CategoryTest")

	public void userIsAbleToEnterManageCateogoryPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPassword(passwordvalue).enterUserName(usernamevalue);
		homepage=loginpage.enterSignIn();
		//ManageCategoryPage managecategoeypage = new ManageCategoryPage(driver);
		FakerUtility faker=new FakerUtility();
		String categoryvalue=faker.generateCategory();
		managecategoeypage=homepage.clickManageCateogoryInfo();
		managecategoeypage.clickNew().enterCategoryValue(categoryvalue).clickDiscount().fileUpload().clickSave();
		//String categoryvalue = ExcelUtility.getStringData(1, 0, "categorypage");
		//managecategoeypage.enterCategoryValue(categoryvalue);
		//managecategoeypage.clickDiscount();
		//managecategoeypage.fileUpload();
		//managecategoeypage.clickSave();
		boolean homepage = managecategoeypage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.ENTERVALUEMANAGECATEGORY);
		//managecategoeypage.isAlertDisplayed();

	}

}
