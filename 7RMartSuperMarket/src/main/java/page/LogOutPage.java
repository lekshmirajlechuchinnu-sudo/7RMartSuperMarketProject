package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	public WebDriver driver;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alert;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")
	WebElement logout;

	public void enterUserName(String usernamevalue) {
		username.sendKeys(usernamevalue);
	}

	public void enterPassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}

	public void enterSignIn() {
		// WaitUtility obj=new WaitUtility();
		// obj.waitForElementToBeClickable(driver, signin);
		signin.click();
	}

	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
	}

	public void clickAdmin() {
		admin.click();
	}

	public void clickLogout() {
		logout.click();
	}


}
