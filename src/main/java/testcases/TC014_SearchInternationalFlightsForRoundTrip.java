package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC014_SearchInternationalFlightsForRoundTrip extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search International Flights";
		testDescription = "Search International Flights for RoundTrip";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC014";
	}
	
	@Test
	public void searchInternationalFlightsForRT(){
		
		new DomesticFlight(driver, test)
		.clickRoundTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Bangkok, Thailand (BKK)")
		.selectDepartureDate()
		.selectReturnDate()
		.clickSearchForInternational();
		
	}

}
