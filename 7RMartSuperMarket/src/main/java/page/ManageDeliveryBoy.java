package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

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
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'and@class='small-box-footer']")
	//WebElement ManageDeliveryBoyMoreInfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newclick;
	@FindBy(xpath = "//input[@id='name']")
	WebElement namedata;
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
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savedeliveryboy;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	/*public void clickManageDeliveryBoyPageMoreInfo() {
		
		ManageDeliveryBoyMoreInfo.click();
}*/

	public ManageDeliveryBoy newButtonClick() {
		WaitUtility obj=new WaitUtility();
		obj.waitForElementToBeClickable(driver, newclick);
		newclick.click();
		return this;
	}

	public ManageDeliveryBoy enterNameValue(String entername)
	{
		namedata.sendKeys(entername);	
		return this;

	}
	public ManageDeliveryBoy enterEmail(String email)
	{
		emailvalue.sendKeys(email);
		return this;
		
	}
	
	public ManageDeliveryBoy enterPhone(int number)
	{
		phone.sendKeys(String.valueOf(number));
		return this;
	}
	public  ManageDeliveryBoy  enterAddress(String address)
	{
		addressvalue.sendKeys(address);
		return this;
	}
	public  ManageDeliveryBoy enterUserName(String username)
	{
		username1.sendKeys(username);
		return this;
	}
	public  ManageDeliveryBoy enterPassword(String password)
	{
		password1.sendKeys(password);
		return this;
		
	}

	public ManageDeliveryBoy clickdelivery() {
		PageUtility obj=new PageUtility();
		obj.clickdelivery(driver, savedeliveryboy);
		return this;
	}
	

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	
	

}
