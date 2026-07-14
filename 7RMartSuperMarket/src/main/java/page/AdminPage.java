package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.ScreenShotUtility;

public class AdminPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")
	WebElement adminusers;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newtab;
	@FindBy(xpath = "//input[@name='username']")
	WebElement typeusername;
	@FindBy(xpath = "//input[@name='password']")
	WebElement typepassword;
	@FindBy(xpath = "//select[@name='user_type']")
	WebElement selectvalue;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger'and@name='Create']")
	WebElement save;
	//@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	//WebElement alert;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickAdminPageMoreInfo() {
		PageUtility obj = new PageUtility();
		obj.click(driver, adminusers);
	}

	public void enterNewTab() {
		newtab.click();
	}
	//public void screenshot() throws IOException {
	
	//ScreenShotUtility obj=new ScreenShotUtility();
	//obj.getScreenShot(driver, "verifyTheUserIsAbleToAddNewItemInAdminUsersPage");
	//}
	

	public void enterAdminUsersCredentials(String usernamevalue1, String passwordvalue1, String value) {
		typeusername.sendKeys(usernamevalue1);
		typepassword.sendKeys(passwordvalue1);
		selectvalue.sendKeys(value);
	}

	public void clickSave() {
		PageUtility obj = new PageUtility();
		obj.click(driver, save);
	}

	

}
