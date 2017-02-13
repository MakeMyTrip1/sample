package pages;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class ResetPasswordPage extends MakeMyTripWrappers {
	
	//WebDriverWait Wait = new WebDriverWait(driver, 30);

	public ResetPasswordPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
        
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
//		String title=driver.getTitle();
		if(!verifyTitle("Reset Password")){
			reportStep("This is not Reset Password Page", "FAIL");
		}
	}

	public ResetPasswordPage EnterNewPassword(String data) throws InterruptedException{ 
		
		Thread.sleep(3000);
		clickById("plainpassword");
		
		enterById("txtPassword", data);
	//	driver.findElementById("txtPassword").sendKeys(Keys.TAB);
		return this;
	}
	
	public ResetPasswordPage RetypePassword(String retypePassword) throws InterruptedException{	
			
		Thread.sleep(3000);
		driver.findElementById("retype_plainpassword").click();
		enterById("retype_password", retypePassword);
		return this;
	}
	
	public ResetPasswordPage ClickSubmitButton() throws InterruptedException{
		clickById("Submit");
		Thread.sleep(5000);
		return this;
	}
	
	public ResetPasswordPage enterEmailAddressAndPassword(String emailId,String password)
	{
		enterById("UC1_email", emailId);
		enterById("UC1_txtPassword", password);
		return this;
	}
	
	public ResetPasswordPage clickLoginButton()
	{
		clickById("UC1_btnLogin");
		return this;
	}
}
