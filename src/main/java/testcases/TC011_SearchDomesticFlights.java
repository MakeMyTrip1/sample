package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC011_SearchDomesticFlights extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Search Domestic Flights";
		testDescription = "Search Domestic Flights for OneWay";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC011";
	}
	
	@Test
	public void searchDomesticFlights(){
		
		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("New Delhi (DEL)")
		.selectDepartureDate()
		.clickSearchFlight();
			
	}
}
