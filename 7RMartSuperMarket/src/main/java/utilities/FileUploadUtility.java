package utilities;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	
	public void fileUploadUsingSendKeys(WebElement choose,String filepath)
	{
		choose.sendKeys("C:\\Users\\gokul\\OneDrive\\Dokumen\\vegetable.jpg");
	}
}
