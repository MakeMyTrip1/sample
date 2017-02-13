package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC021_CompleteInterationalRoundTrip extends MakeMyTripWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Complete International RoundTrip";
		testDescription = "Complete International Round Trip Flight Booking With Mandatory details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC021";
	}
	
	@Test
	public void CompleteInterationalRoundTrip() throws Throwable{

		new DomesticFlight(driver, test)
		.clickRoundTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Bangkok (BKK)")
		.selectDepartureDate()
		.selectReturnDate()
		.clickSearchForInternational()
		.clickBookNowButtonInternational()
		.enterMailIdInternational("Rh@gmail.com")
		.clickContinueAsGuestInInternational();				
		
	}


}
