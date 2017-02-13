package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC015_SelectingNoOfStopsOption extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting No of stops option";
		testDescription = "Book a ticket by selecting No of stops option";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC015";
	}

	@Test
	public void selectingNoOFOption(){

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("New Delhi (DEL)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectNoOfStops();
		
	}

}
