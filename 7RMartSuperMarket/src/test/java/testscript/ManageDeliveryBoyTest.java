package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.ManageDeliveryBoy;
import page.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageDeliveryBoyTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"},description="testcase is for managing DeliveryBoyTest")

	public void verifyTheUserIsAbleToUpdateManageDeliveryBoyPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterValidaCredentials(usernamevalue, passwordvalue);
		ManageDeliveryBoy managedeliveryboy = new ManageDeliveryBoy(driver);
		managedeliveryboy.clickManageDeliveryBoyPageMoreInfo();
		managedeliveryboy.newButtonClick();
		//String name = ExcelUtility.getStringData(1, 0, "deliveryboypage");
		String emailvalue = ExcelUtility.getStringData(1, 1, "deliveryboypage");
		int phone = ExcelUtility.getIntegerData(1, 2, "deliveryboypage");
		//String addressvalue=ExcelUtility.getStringData(1, 3, "deliveryboypage");
		//String username1=ExcelUtility.getStringData(1, 4, "deliveryboypage");
		//String passwor1=ExcelUtility.getStringData(1, 5,"deliveryboypage");
		FakerUtility faker=new FakerUtility();
		String name=faker.generateCategory();
		String addressvalue=faker.generateCategory();
		String username1=faker.generateCategory();
		String passwor1=faker.generateCategory();
		managedeliveryboy.enterPhoneEmailNameAddressUserNamepassword(name, emailvalue, phone, addressvalue, username1, passwor1);
		managedeliveryboy.clickSaveButton();
		//boolean homepage = managedeliveryboy.isAlertDisplayed();
		//Assert.assertTrue(homepage);

	}

}
