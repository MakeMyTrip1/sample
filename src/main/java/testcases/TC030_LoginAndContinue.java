package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC030_LoginAndContinue extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login to Book hotel";
		testDescription = "To verify user to able to login the account from review page by clicking on Login & continue button";
		category = "smoke";
		authors = "Jayaram";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void BooKWithLogin() throws InterruptedException
	{
		driver.manage().deleteAllCookies();
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("bbbvig@yopmail.com")
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
        .EnterEmailID("aaavig@yopmail.com")
        .EnterPassword("aaavig")
        .ClickContinueButton();
		
        
      }
}
