package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(@class,'btn-dark')]")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alert;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// local driver and current class instance driver

	}

	public LoginPage enterUserName(String usernamevalue) {
		username.sendKeys(usernamevalue);
		return this;
	}

	public LoginPage enterPassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
		return this;
	}

	public HomePage enterSignIn() {
		//WaitUtility obj=new WaitUtility();
		//obj.waitForElementToBeClickable(driver, signin);
		signin.click();
		return new HomePage(driver);
	}

	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	/*public void enterValidaCredentials(String usernamevalue, String passwordvalue) {
		username.sendKeys(usernamevalue);
		password.sendKeys(passwordvalue);
		signin.click();
	}*/



}
