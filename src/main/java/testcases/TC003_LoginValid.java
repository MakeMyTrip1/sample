package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC003_LoginValid extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "To verify user is able to login the account succesfully with valid credential";
		category = "smoke";
		authors = "Vignesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void LoginValid()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue();
	}
}
