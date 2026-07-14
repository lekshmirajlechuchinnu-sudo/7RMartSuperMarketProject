package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageDeliveryBoy {

	public WebDriver driver;

	public ManageDeliveryBoy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(css = "button.btn.btn-dark.btn-block")
	WebElement signin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'and@class='small-box-footer']")
	WebElement deliveryboy;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newclick;
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailvalue;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressvalue;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username1;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password1;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger'and@name='Create']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public void clickManageDeliveryBoyPageMoreInfo() {
		
		deliveryboy.click();
}

	public void newButtonClick() {
		newclick.click();
	}

	public void enterPhoneEmailNameAddressUserNamepassword(String entername,String enteremail,int number,String enteraddress,String enterusername,String enterpassword)
	{
		name.sendKeys(entername);	
		emailvalue.sendKeys(enteremail);
		phone.sendKeys(String.valueOf(number));
		addressvalue.sendKeys(enteraddress);
		username1.sendKeys(enterusername);
		password1.sendKeys(enterpassword);

	}

	public void clickSaveButton() {
		PageUtility obj = new PageUtility();
		obj.clickSave(driver, save);
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	
	

}
