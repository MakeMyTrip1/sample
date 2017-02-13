package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class Dashboard extends MakeMyTripWrappers {
	
	//Verify its a Dashboard page or not
	public Dashboard(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;		
		if(!verifyTitle("Flights + Hotels - Book Flight & Hotel Deals at Discounted Prices | MakeMyTrip India")){
			reportStep("This is not Dashboard Page", "FAIL");
		}
	}
	
	//Click Login menu button.
	public Dashboard clickLoginMenu()
	{
		clickById("ssologinlink");		
		return this;
	}
	
	//Click create new user button
	public Dashboard clickCreateNewUser()
	{
		clickById("openNewUserDivlink");
		return this;
	}
	
	//Enter new user email id
	public Dashboard enterNewEmailId(String emailId)
	{
		enterById("newusername", emailId);
		driver.findElementById("newusername").sendKeys(Keys.TAB);
		return this;
	}
	
	//Enter New Password
	public Dashboard enterNewPassword(String password)
	{
		enterById("newpassword", password);
		driver.findElementById("newpassword").sendKeys(Keys.TAB);
		return this;
	}
	
	//Enter Confirm Password
	public Dashboard enterConfirmPassword(String confirmPassword)
	{
		enterById("repassword", confirmPassword);
		driver.findElementById("repassword").sendKeys(Keys.TAB);
		return this;
	}
	
	//Click I agree checkbox
	public Dashboard clickIAgree()
	{
		clickById("iagreeSpan");
		return this;
	}
	
	//Click create account button
	public Dashboard clickCreateAccountButton()
	{
		clickById("create_act_btn");
		return this;
	}
	
	//verify error message in Confirm password 
	public Dashboard verifyErrorInConfirmPassword(String errorMessage)
	{
		verifyTextByXpath("(//span[@id='errormsg_password'])[13]", errorMessage);
		return this;
	}
	
	//Log out
	public Dashboard logOut()
	{
		clickByXpath("(//input[@class='sign_out chf_flL'])[1]");
		return this;
	}	
	
	//Enter Email Address for login
	public Dashboard enterEmailIdForLogin(String emailId)
	{
		enterById("username", emailId);
		driver.findElementById("username").sendKeys(Keys.TAB);
		return this;
	}
	
	//Enter Password for login
	public Dashboard enterPasswordForLogin(String emailId)
	{
		enterById("password", emailId);
		driver.findElementById("password").sendKeys(Keys.TAB);
		return this;
	}
	
	//Click Login button
	public Dashboard clickContinue()
	{
		clickByXpath("//input[@id='login_btn']");
		return this;
	}
	
	//Verify error message for invalid password 
	public Dashboard verifyInvalidPasswordErrorMessage(String errorMessage)
	{
		verifyTextByXpath("(//span[@id='errormsg_password'])[3]", errorMessage);
		return this;
	}
	
	//Verify error message for invalid email id
	public Dashboard verifyInvalidMailIdMessage(String errorMessage)
	{
		verifyTextByXpath("(//span[@id='errormsg_password'])[5]", errorMessage);
		return this;
	}
	
	//click forgot password
	public Dashboard clickForgotPassword()
	{
		clickById("openFgrPwdLink");
		return this;
	}
	
	
	//enter email in forgot password
	public Dashboard enterEmailInForgotPassword(String email)
	{
		enterById("fp_email", email);
		driver.findElementById("fp_email").sendKeys(Keys.TAB);
		return this;
	}
	
	//click submit button
	public Dashboard clickSubmitButton()
	{
		clickById("fpwd_btn");
		return this;
	}
	
	public Yopmail LoadYopMail (){
		driver.get("http://www.yopmail.com/en/");
		return new Yopmail(driver, test);
	}
	
	//verify the error message in forgot password
	public Dashboard verifyErrorMessageInForgotPassword(String errorMessage)
	{
		verifyTextByXpath("(//span[@class='chf_errortext chf_flL chf_error_msg'])[8]", errorMessage);
		return this;
	}
	
	//Click my profile 
	public CustomerSupport clickMyProfile() throws InterruptedException
	{
		clickByLink("My Profile");
		Thread.sleep(5000);
		return new CustomerSupport( driver,  test);
	}
	
	
	//click Flight Tab in the dashboard
	public DomesticFlight clickFlightTab()
	{
		clickByXpath("//span[@class='flgh_pic tab_icn']");		
		return new DomesticFlight( driver,  test);		
	}	

	//click hotels tab
	public DomesticHotel selectHotelsTab()
	{
		clickByXpath("//span[@class='hotel_pic tab_icn']");
		return new DomesticHotel( driver,  test);
	}	
		
	//click menu button
	public Dashboard clickMenuButton()
	{
		clickByXpath("//a[@class='all_menuitem alC']");
		return this;
	}
	
	//click Domestic flight
	public DomesticFlight clickDomesticFlightButton()
	{
		clickByXpathNoSnap("(//a[@href='//www.makemytrip.com/flights'])[1]");
		switchToLastWindow();
		return new DomesticFlight( driver,  test);
	}
	
	//click International flight
	public InternationalFlight clickInternationalButton()
	{
		clickByXpathNoSnap("(//a[@href='//www.makemytrip.com/international-flights'])[1]");
		switchToLastWindow();
		return new InternationalFlight(driver, test);
	}
	
	//click Domestic Hotel 
	public DomesticHotel clickDomesticHotelButton()
	{
		clickByXpathNoSnap("(//a[@href='//www.makemytrip.com/hotels'])[1]");
		switchToLastWindow();
		return new DomesticHotel(driver, test);
	}
	
	//click International Hotel
	public InternationalHotel clickInternationalHotelButton()
	{
		clickByXpathNoSnap("(//a[@href='//www.makemytrip.com/hotels-international/'])[1]");
		switchToLastWindow();
		return new InternationalHotel(driver, test);
	}
	
}
