package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC028_BookRoom extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Room book";
		testDescription = "To verify user is able to book a room based on the requirement";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void RoomBook() throws InterruptedException
	{
		driver.manage().deleteAllCookies();
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
        .selectHotelsTab()
        //.selectInternationalOptionInHotel()
        .enterCity("Chennai")
        .enterCheckInDate()
        .enterCheckOutDate()
        //.selectNoOfAdultsInHotel(2)
        //.selectNoOfChildrenInHotel(2)
        .clickSearchHotel()
        .ClickHotel()
        .ClickRoom()
        .BookRoom();
		
        
      }
}
