package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC005_LogOut extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Logout";
		testDescription = "To verify user to able to logout of the application successfully";
		category = "Smoke";
		authors = "Pakeer";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void Logout()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
		.clickLoginMenu()
		.logOut();
	}
}
