package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC020_CompleteInternationalOneWayFlightBooking extends MakeMyTripWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Complete International OnewayTrip";
		testDescription = "Complete International Oneway Flight Booking With Mandatory details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC020";
	}
	
	@Test
	public void CompleteInternationalOnewayTrip() throws Throwable{

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Bangkok (BKK)")
		.selectDepartureDate()
		.clickSearchForInternational()
		.clickBookNowButtonInternational()
		.enterMailIdInternational("Rh@gmail.com")
		.clickContinueAsGuestInInternational()
		.enterFirstNameInInternational("Kerthu")
		.enterSurNameInInternational("Kumar")
		.enterPhoneNumberInInternational("9632589658")
		.uncheckTravelServicesInInternational();
		
		
	}

}
