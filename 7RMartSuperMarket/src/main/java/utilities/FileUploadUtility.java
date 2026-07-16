package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	
	public void fileUploadUsingSendKeys(WebElement choose,String filepath)
	{
		choose.sendKeys("C:\\Users\\gokul\\OneDrive\\Dokumen\\vegetable.jpg");
	}
	
	

	public void fileUploadUsingRobotClass(WebElement elementname,String filepath) throws AWTException
	{
		StringSelection obj=new StringSelection(filepath);//direct intercation not possible for pop up
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);//equivalent to ctrl+c 
		Robot r=new Robot();//for keyboard event
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
