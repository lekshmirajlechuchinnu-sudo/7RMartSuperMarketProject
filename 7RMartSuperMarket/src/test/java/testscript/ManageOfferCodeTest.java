package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import page.LoginPage;

import page.ManageOfferCodePage;
import utilities.ExcelUtility;

public class ManageOfferCodeTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"},description="testcase is for managing offer")
	
	public void verifyTheUserIsAbleToUpdateManageOfferCodePage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterValidaCredentials(usernamevalue, passwordvalue);
		ManageOfferCodePage manageoffercode = new ManageOfferCodePage(driver);
		manageoffercode.clickManageOfferCodeInfo();
		manageoffercode.newClick();
		String offercodeneter=ExcelUtility.getStringData(1, 0, "offerpage");
		int percent=ExcelUtility.getIntegerData(1, 1, "offerpage");
		int amount=ExcelUtility.getIntegerData(1, 2, "offerpage");
		manageoffercode.enterOfferCodeOrderUsePercentAmountDescription(offercodeneter, percent, amount);
		manageoffercode.fileUpload();
		manageoffercode.clickSave();
		manageoffercode.isAlertDisplayed();
		
		
	}

}
