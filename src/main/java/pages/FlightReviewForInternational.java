package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.MakeMyTripWrappers;

public class FlightReviewForInternational extends MakeMyTripWrappers{

	public FlightReviewForInternational(RemoteWebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("International Flights Air Tickets, Cheap International Air fares at MakeMyTrip")){

			reportStep("This is not Internationl Flight Review Page", "FAIL");
		}
	}

	public FlightReviewForInternational enterMailIdInternational(String eMail){

		enterById("inputEmailIdForLoggin", eMail);
		return this;
	}

	public FlightReviewForInternational enterCouponInternational(String coupon){

		enterByXpath("(//div[@class='input-group'])[2]//input", coupon);
		return this;
	}

	public FlightReviewForInternational clickApplyInternational(){

		clickByLink("Apply");
		return this;
	}

	public FlightReviewForInternational verifyErrorMessageInternational(String errorMessage){

		verifyTextByXpath("(//span[@class='pull-left promo_txt'])[1]", errorMessage);
		return this;
	}

	public FlightReviewForInternational selectTermsConditionInternational(){

		clickByXpath("//span[@class='checkbox_state_review pull-left active']");
		return this;
	}

	public FlightTravellersInternational clickContinueAsGuestInInternational(){

		clickByLink("Continue as Guest");
		return new FlightTravellersInternational(driver, test);
	}

	public FlightReviewForInternational clickLoginAndContinueInternational(){

		clickByLink("Login & Continue");
		return this;
	}

	public FlightReviewForInternational enterUsernamePassword(String userName, String password){

		enterById("username", userName);
		enterById("password", password);
		return this;
	}

	//
	public FlightReviewForInternational clickLoginInternational(){

		clickById("login_btn");
		return this;
	}
}