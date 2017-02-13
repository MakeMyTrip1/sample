package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class Yopmailinbox extends MakeMyTripWrappers {

	public Yopmailinbox(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("YOPmail - Inbox")){
			reportStep("This is not YOPmail Inbox Page", "FAIL");
		}
	}

		public Yopmailinbox CheckForMailButton (){
		clickByClassName("slientext");
		return this;
		}
	
		
		public ResetPasswordPage Clicklink() throws InterruptedException{
		driver.switchTo().frame("ifmail");
		clickByLink("link");
		Thread.sleep(3000);
		switchToLastWindow();
		/*Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();*/
		return new ResetPasswordPage (driver, test);
		}
}
