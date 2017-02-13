package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.DomesticFlight;
import pages.FlightSelect;
import wrappers.MakeMyTripWrappers;

public class TC017_SelectingAirlines extends MakeMyTripWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Selecting Airlines";
		testDescription = "To verify user to able to book a ticket by selecting Airlines option";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
	}
	
	@Test
	public void selectingAirLines(){
		
		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("New Delhi (DEL)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectAirlines();
		
		
	}

}
