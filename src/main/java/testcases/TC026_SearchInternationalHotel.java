package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC026_SearchInternationalHotel extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "International Hotel search";
		testDescription = "To verify user to able search hotels by entering mandatory details with international option";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void InternationalHotelSearch()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
        .selectHotelsTab()
        //.selectInternationalOptionInHotel()
        .enterCity("New South Wales, Australia")
        .enterCheckInDate()
        .enterCheckOutDate()
        //.selectNoOfAdultsInHotel(2)
        //.selectNoOfChildrenInHotel(2)
        .clickSearchHotel();
        
        
        }
}