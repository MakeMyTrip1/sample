package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class HotelReviewPage  extends MakeMyTripWrappers {	
	
	public HotelReviewPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Online Hotel Booking for Cheap, Budget & Luxury Hotels in India | MakeMyTrip.com")){
			reportStep("This is not the URL ", "FAIL");
}
}
	//Click on Login & Continue button
			public HotelReviewPage Clickloginbutton(){
				clickByLink("Login & Continue");
				return this;
			}
			
			
	//Enter Email id in sweet alert
			public HotelReviewPage EnterEmailID(String data){
				enterById("username", data);
				driver.findElementById("username").sendKeys(Keys.TAB);
				return this;
			}
			
	//Enter password in sweet alert
			public HotelReviewPage EnterPassword(String data){
		    enterByXpath("//*[@id='password']", data);
				return this;
			}
			
	//Click on continue button in sweet alert
			public HotelReviewPage ClickContinueButton(){
			    clickById("login_btn");
				return this;
			}

	//Click on "Continue as Guest" button
			public HotelTravellersPage ClickContinueGuestButton(){
			    clickByXpath("//*[@id='contAsGuest']");
				return new HotelTravellersPage(driver,test);
			}

}