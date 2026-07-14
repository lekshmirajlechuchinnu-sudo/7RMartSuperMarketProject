package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {

	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'and @class='small-box-footer']")
	WebElement managecateogory;
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

	public void clickManageCateogoryInfo() {
		managecateogory.click();
	}

	public void clickNew() {
		newclick.click();
	}

	public void enterCategoryValue(String categoryvalue) {
		category.sendKeys(categoryvalue);
	}

	public void clickDiscount() {
		PageUtility obj = new PageUtility();
		obj.clickDiscount(driver,selctgroup );
	}

	public void fileUpload() {
		FileUploadUtility obj = new FileUploadUtility();
		obj.fileUploadUsingSendKeys(choose, Constant.IMAGE);
	}

	public void clickSave() {
		PageUtility obj = new PageUtility();
		obj.click(driver, save);
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
