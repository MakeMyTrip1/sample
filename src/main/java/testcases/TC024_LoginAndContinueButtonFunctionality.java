package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC024_LoginAndContinueButtonFunctionality extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login & Continue Button Functionality";
		testDescription = "verifying the Login & Continue button in flight review page";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC024";
	}

	@Test
	public void loginAndContinueButtonFunction(){

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Kolkata (CCU)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectBookButton()
		.clickLoginAndContinue()
		.enterLoginId("rjrjku@yopmail.com")
		.enterPassword("rjrjku")
		.clickLoginButton();
	
	}
}
