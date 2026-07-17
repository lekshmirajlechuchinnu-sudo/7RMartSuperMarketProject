package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageNewsPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(@class,'btn-dark')]")
	WebElement signin;
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']")
	//WebElement ManageNewsInfo;
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

	/*public void clickManageNewsInfo() {
		PageUtility obj = new PageUtility();
		obj.clicknews(driver,ManageNewsInfo);
	}*/

	public ManageNewsPage enterNewUpdate() {
		WaitUtility obj=new WaitUtility();
		obj.waitForElementToBeClickable(driver, newsupdate);
		newsupdate.click();
		return this;
	}

	public ManageNewsPage enterAnyNews(String news) {
		enternews.sendKeys(news);
		return this;
	}

	public ManageNewsPage clickSave() {
		PageUtility obj = new PageUtility();
		obj.clickSave(driver, save);
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
