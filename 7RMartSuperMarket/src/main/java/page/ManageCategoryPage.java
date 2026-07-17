package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {

	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and @class='small-box-footer']")
	//WebElement managecateogoryinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newclick;
	@FindBy(xpath = "//input[@name='category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='2-selectable']")
	WebElement selctgroup;
	@FindBy(xpath = "//input[@name='main_img']")
	WebElement choose;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*public void clickManageCateogoryInfo() {
		managecateogoryinfo.click();
	}*/

	public ManageCategoryPage clickNew() {
		WaitUtility obj=new WaitUtility();
		obj.waitForElementToBeClickable(driver, newclick);
		newclick.click();
		return this;
	}

	public ManageCategoryPage enterCategoryValue(String categoryvalue) {
		category.sendKeys(categoryvalue);
		return this;
	}

	public ManageCategoryPage clickDiscount() {
		PageUtility obj = new PageUtility();
		obj.clickDiscount(driver,selctgroup );
		return this;
	}

	public ManageCategoryPage fileUpload() {
		FileUploadUtility obj = new FileUploadUtility();
		obj.fileUploadUsingSendKeys(choose, Constant.IMAGE);
		return this;
	}

	public ManageCategoryPage clickSave() {
		PageUtility obj = new PageUtility();
		obj.click(driver, save);
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
