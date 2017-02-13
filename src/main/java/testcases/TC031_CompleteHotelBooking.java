package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC031_CompleteHotelBooking extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Navigate to payment page";
		testDescription = "To verify user is able to fill all mandatory details in travellers page and navigate to payment page";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void PagmentPage() throws InterruptedException
	{
		driver.manage().deleteAllCookies();
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("cccvig@yopmail.com")
		.enterPasswordForLogin("bbbvig")
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
        .Clickloginbutton()
        .EnterEmailID("bbbvig@yopmail.com")
        .EnterPassword("bbbvig")
        .ClickContinueButton()
        .ClickContinueGuestButton()
        .Enterfirstname("AAA")
        .Enterlastname("BBB")
        //.EnterEmailID("AAA@yopmail.com")
        .EnterMobilenumber("9962272871")
        .ClickPaymentbutton();
		
        
      }
}
