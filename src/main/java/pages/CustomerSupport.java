package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class CustomerSupport extends MakeMyTripWrappers {
		
	public CustomerSupport(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Customer Support - MakeMyTrip - India's No.1 Travel Company")){
			reportStep("This is not Customer Support Page", "FAIL");
		}
	}
	
	public CustomerSupport MySettings(){
		clickByLink("My Settings");
		return this;
	}
	
	public CustomerSupport OldPassword(String data){
		enterById("profile_settings_password_oldpass", data);
		driver.findElementById("profile_settings_password_oldpass").sendKeys(Keys.TAB);
		return this;
	}
	
	public CustomerSupport NewPassword(String data){
		enterById("profile_settings_password_newpass", data);
		driver.findElementById("profile_settings_password_newpass").sendKeys(Keys.TAB);
		return this;
	}
	
	public CustomerSupport ReconfirmPassword(String data){
		enterById("profile_settings_password_reconfirmnewpass", data);
		driver.findElementById("profile_settings_password_reconfirmnewpass").sendKeys(Keys.TAB);
		return this;
	}
		
	public CustomerSupport PasswordSubmitbutton() throws InterruptedException{
		clickById("profile_settings_password_savebutton");
		Thread.sleep(5000);
		return this;
	}
	
	public CustomerSupport VerifyPasswordChangedTextMsg(String data){
		//(Your Password has been Changed - should be entered in Test case to verify the text)
		verifyTextByXpath("//p[contains(text(), 'Your Password has been Changed.')]", data);
		return this;
	}
	
	
	public CustomerSupport VerifyPasswordNotCorrectTextErrorMsg(String data){
		//(The old Password is not correct - should be entered in Test case to verify the text)
		verifyTextByXpath("//div[contains(text(), 'The old Password is not correct')]", data);
		return this;	
	}
}

	