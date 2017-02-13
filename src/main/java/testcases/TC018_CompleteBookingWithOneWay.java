package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC018_CompleteBookingWithOneWay extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Complete the Oneway Booking";
		testDescription = "Complete the oneway booking with Mandatory details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC018";
	}
	
	@Test
	public void CompleteOnewayBooking() throws Throwable{

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Kolkata (CCU)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectBookButton()
		.enterContactInfo("Vbc@yopmail.com")
		.clickContinueAsGuest()
		.enterFirstName("Kiran")
		.enterLastName("Das")
		.selectGenderMale()
		.enterPhoneNumber("8963256985");
		
	}
	
}
