package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.HomePage;
import page.LoginPage;

import page.ManageOfferCodePage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageOfferCodeTest extends Base {
	HomePage homepage;
	ManageOfferCodePage manageoffercode;
	@Test(retryAnalyzer=retry.Retry.class,description="testcase is for managing offer")
	
	public void verifyTheUserIsAbleToUpdateManageOfferCodePage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		//ManageOfferCodePage manageoffercode = new ManageOfferCodePage(driver);
		FakerUtility faker=new FakerUtility();
		String offercodeenter=faker.generateCategory();
		int percent=ExcelUtility.getIntegerData(1, 1, "offerpage");
		int amount=ExcelUtility.getIntegerData(1, 2, "offerpage");
		manageoffercode=homepage.clickManageOfferCodeInfo();
		//manageoffercode.newClick();
		//String offercodeneter=ExcelUtility.getStringData(1, 0, "offerpage");
    	manageoffercode.enterOfferCodeOrderUsePercentAmountDescription(offercodeenter, percent, amount).fileUpload().clickSave().newClick();
		//manageoffercode.fileUpload();
		//manageoffercode.clickSave();
		//manageoffercode.isAlertDisplayed();
    	boolean homepage = manageoffercode.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.ENTERVALUEMANAGEOFFER);
		
		
	}

}
