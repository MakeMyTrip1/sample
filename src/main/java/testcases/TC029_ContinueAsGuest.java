package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC029_ContinueAsGuest extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "As guest";
		testDescription = "To verify user is able is able to navigate to travellers page as a guest";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void BookAsGuest() throws InterruptedException
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
        .BookRoom()
        .ClickContinueGuestButton();
		
        
      }
}

