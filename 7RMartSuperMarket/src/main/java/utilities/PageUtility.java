package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public void click(WebDriver driver, WebElement adminusers) {
		Actions action = new Actions(driver);
		action.click(adminusers).perform();

	}
	public void clicknews(WebDriver driver, WebElement managenews) {
		Actions action = new Actions(driver);
		action.click(managenews).perform();

	}

	public void clickUpdate(WebDriver driver, WebElement update) {
		Actions action = new Actions(driver);
		action.click(update).perform();

	}

	public void clickUpdateFooter(WebDriver driver, WebElement update) {
		Actions action = new Actions(driver);
		action.click(update).perform();

	}

	public void clickDiscount(WebDriver driver, WebElement selctgroup) {
		Actions action = new Actions(driver);
		action.click(selctgroup).perform();

	}

	public void clickSave(WebDriver driver, WebElement save) {
		Actions action = new Actions(driver);
		action.click(save).perform();

	}

	public void dropDownVisibleTest(WebElement selectvalue, String visibletext) {
		Select select = new Select(selectvalue);
		select.selectByVisibleText(visibletext);

	}

}
