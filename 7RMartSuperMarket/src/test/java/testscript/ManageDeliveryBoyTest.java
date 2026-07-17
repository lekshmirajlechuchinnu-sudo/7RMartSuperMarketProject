package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import page.ManageDeliveryBoy;
import page.HomePage;
import page.LoginPage;
import page.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageDeliveryBoyTest extends Base {
	HomePage homepage;
	ManageDeliveryBoy managedeliveryboy;
	@Test(retryAnalyzer=retry.Retry.class,description="testcase is for managing DeliveryBoyTest")

	public void verifyTheUserIsAbleToUpdateManageDeliveryBoyPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		homepage=loginpage.enterSignIn();
		//ManageDeliveryBoy managedeliveryboy = new ManageDeliveryBoy(driver);
		//String name = ExcelUtility.getStringData(1, 0, "deliveryboypage");
		String emailvalue = ExcelUtility.getStringData(1, 1, "deliveryboypage");
		int phone = ExcelUtility.getIntegerData(1, 2, "deliveryboypage");
		//String addressvalue=ExcelUtility.getStringData(1, 3, "deliveryboypage");
		//String username1=ExcelUtility.getStringData(1, 4, "deliveryboypage");
		String passwor1=ExcelUtility.getStringData(1, 5,"deliveryboypage");
		FakerUtility faker=new FakerUtility();
		String name=faker.generateCategory();
		String addressvalue=faker.generateAddress();
		String username1=faker.creatARandomFirstName();
        managedeliveryboy=homepage.clickManageDeliveryBoyPageMoreInfo();
		managedeliveryboy.newButtonClick().enterNameValue(name).enterAddress(addressvalue).enterEmail(emailvalue).enterPhone(phone).enterUserName(username1).enterPassword(passwor1).clickdelivery();	
		//managedeliveryboy.clickSaveButton();
		//managedeliveryboy.clickdelivery();
		//managedeliveryboy.isAlertDisplayed();
		boolean homepage = managedeliveryboy.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.ENTERVALUEMANAGEDELIVERY);
		

	}

}
