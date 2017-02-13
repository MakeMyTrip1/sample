package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC023_ModifyFlightDetails extends MakeMyTripWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Modify Flight Details";
		testDescription = "To verify user is able to modify the flight Details";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC023";
	}

	@Test
	public void modifyFlightDetails() throws Throwable{
		
		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Kolkata (CCU)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectModifySearch()
		.modifyToCity("Mumbai, India (BOM)")
		.submitModifiedCity()
		.verifyModifiedFlight("Chennai to Mumbai");
	}

}
