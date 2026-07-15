package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import page.LoginPage;
import page.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	@Test(description="testcase is for managing CategoryTest")

	public void userIsAbleToEnterManageCateogoryPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterValidaCredentials(usernamevalue, passwordvalue);
		ManageCategoryPage managecategoeypage = new ManageCategoryPage(driver);
		managecategoeypage.clickManageCateogoryInfo();
		managecategoeypage.clickNew();
		FakerUtility faker=new FakerUtility();
		String categoryvalue=faker.generateCategory();
		//String categoryvalue = ExcelUtility.getStringData(1, 0, "categorypage");
		managecategoeypage.enterCategoryValue(categoryvalue);
		managecategoeypage.clickDiscount();
		managecategoeypage.fileUpload();
		managecategoeypage.clickSave();
		managecategoeypage.isAlertDisplayed();

	}

}
