package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC016_SelectingDepartureDimeFromOption extends MakeMyTripWrappers{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting Departure Dime From Option";
		testDescription = "Book a ticket by selecting Departure Dime From Option";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC016";
	}
	
	@Test
	public void selectFlightTimings(){
		
		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("New Delhi (DEL)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectTiming();
		
		
	}
}
