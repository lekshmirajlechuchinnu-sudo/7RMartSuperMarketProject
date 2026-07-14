package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']")
	WebElement managenews;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newsupdate;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement enternews;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickManageNewsInfo() {
		PageUtility obj = new PageUtility();
		obj.clicknews(driver, managenews);
	}

	public void enterNewUpdate() {
		newsupdate.click();
	}

	public void enterAnyNews(String news) {
		enternews.sendKeys(news);
	}

	public void clickSave() {
		PageUtility obj = new PageUtility();
		obj.clickSave(driver, save);
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
