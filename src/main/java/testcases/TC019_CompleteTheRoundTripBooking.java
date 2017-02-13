package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC019_CompleteTheRoundTripBooking extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Complete the RoundTrip Booking";
		testDescription = "Complete the oneway booking with Mandatory details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC019";
	}
	
	@Test
	public void CompleteRoundTripBooking() throws Throwable{

		new DomesticFlight(driver, test)
		.clickRoundTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Kolkata (CCU)")
		.selectDepartureDate()
		.selectReturnDate()
		.clickSearchForRT()
		.selectBookButton()
		.enterContactInfo("Vbc@yopmail.com")
		.clickContinueAsGuest()
		.enterFirstName("Kiran")
		.enterLastName("Das")
		.selectGenderMale()
		.enterPhoneNumber("8963256985");
		
	}
	
	
}
