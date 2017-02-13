package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC025_SearchDomesticHotel extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Domestic Hotel search";
		testDescription = "To verify user to able search hotels by entering mandatory details with dosmestic option";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void DomesticHotelSearch()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
        .selectHotelsTab()
        //.selectDomesticOptionInHotel()
        .enterCity("Chennai,India")
        .enterCheckInDate()
        .enterCheckOutDate()
        /*.selectNoOfAdultsInHotel(2)
        .selectNoOfChildrenInHotel(2)*/
        .clickSearchHotel();
        
        
        }
}