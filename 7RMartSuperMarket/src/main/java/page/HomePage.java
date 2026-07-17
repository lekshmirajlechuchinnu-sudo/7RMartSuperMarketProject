package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {

	public WebDriver driver;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")
	WebElement AdminPageMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and @class='small-box-footer']")
	WebElement managecateogoryinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'and@class='small-box-footer']")
	WebElement ManageDeliveryBoyMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']")
	WebElement ManageNewsInfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode'and@class='small-box-footer']")
	WebElement ManageOfferCodeInfo;
	
	
	
	
	
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
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")
	WebElement logout;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	PageUtility pageutility=new PageUtility();
	WaitUtility wait=new WaitUtility();
	
	
	public AdminPage clickAdminPageMoreInfo() {
		wait.waitForElementToBeClickable(driver, AdminPageMoreInfo);
		pageutility.click(driver, AdminPageMoreInfo);
		return new AdminPage(driver);
	}
	public ManageCategoryPage clickManageCateogoryInfo() {
		WaitUtility obj=new WaitUtility();
		obj.waitForElementToBeClickable(driver, managecateogoryinfo);
		managecateogoryinfo.click();
		return new ManageCategoryPage(driver);
	}
public ManageDeliveryBoy clickManageDeliveryBoyPageMoreInfo() {
	WaitUtility obj=new WaitUtility();
	obj.waitForElementToBeClickable(driver, ManageDeliveryBoyMoreInfo);
	ManageDeliveryBoyMoreInfo.click();
	return new ManageDeliveryBoy(driver);
}
public ManageNewsPage clickManageNewsInfo() {
	WaitUtility obj=new WaitUtility();
	obj.waitForElementToBeClickable(driver, ManageNewsInfo);
	PageUtility obj1 = new PageUtility();
	obj1.clicknews(driver,ManageNewsInfo);
	return new ManageNewsPage(driver);
}
public ManageOfferCodePage clickManageOfferCodeInfo()
{    
	WaitUtility obj=new WaitUtility();
	obj.waitForElementToBeClickable(driver, ManageOfferCodeInfo);
	ManageOfferCodeInfo.click();
	return new ManageOfferCodePage(driver);
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
