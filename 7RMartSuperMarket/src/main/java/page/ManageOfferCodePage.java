package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageOfferCodePage {
	
	public ManageOfferCodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;

	

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode'and@class='small-box-footer']")
	//WebElement ManageOfferCodeInfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newclick;
	@FindBy(xpath="//input[@placeholder='Enter the Offer Code']")
	WebElement offercodeenter;
	@FindBy(xpath="//input[@placeholder='Percentage']")
	WebElement percent;
	@FindBy(xpath="//input[@placeholder='Amount']")
	WebElement amount;
	@FindBy(xpath="//input[@id='main_img']")
	WebElement choose;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	/*public void clickManageOfferCodeInfo()
	{
		ManageOfferCodeInfo.click();
	}*/
	
	public ManageOfferCodePage newClick()
	{   
		WaitUtility obj1=new WaitUtility();
		obj1.waitForElementToBeClickable(driver, newclick);
		PageUtility obj = new PageUtility();
		obj.clickDiscount(driver,newclick );
		return this;
		
	}
	public ManageOfferCodePage enterOfferCodeOrderUsePercentAmountDescription(String enteroffer,int enterpercent,int enteramount)
	{
		offercodeenter.sendKeys(enteroffer);
		percent.sendKeys(String.valueOf(enterpercent));
		amount.sendKeys(String.valueOf(enteramount));
		return this;
		
		
		
	}
	
	public ManageOfferCodePage fileUpload() {
		FileUploadUtility obj = new FileUploadUtility();
		obj.fileUploadUsingSendKeys(choose, Constant.IMAGE);
		return this;
	}
	public ManageOfferCodePage clickSave() {
		PageUtility obj = new PageUtility();
		obj.click(driver, save);
		return this;
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
