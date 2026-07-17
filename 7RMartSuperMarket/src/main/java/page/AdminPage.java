package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class AdminPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(@class,'btn-dark')]")
	WebElement signin;
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")
	//WebElement AdminPageMoreInfo;
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
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*public void clickAdminPageMoreInfo() {
		PageUtility obj = new PageUtility();
		obj.click(driver, AdminPageMoreInfo);
	}*/
	PageUtility pageutility=new PageUtility();
	WaitUtility wait=new WaitUtility();

	public AdminPage enterNewTab() {
		wait.waitForElementToBeClickable(driver, newtab);
		pageutility.click(driver, newtab);
		return this;
	}
	
	

	public AdminPage enterAdminUsersCredentials(String usernamevalue1, String passwordvalue1, String value) {
		wait.waitForElementToBeClickable(driver, typeusername);
		typeusername.sendKeys(usernamevalue1);
		wait.waitForElementToBeClickable(driver, typepassword);
		typepassword.sendKeys(passwordvalue1);
		selectvalue.sendKeys(value);
		return this;
	}

	public AdminPage clickSave() {
		wait.waitForElementToBeClickable(driver, save);
		pageutility.click(driver, save);
		return this;
	}
    
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	

}
