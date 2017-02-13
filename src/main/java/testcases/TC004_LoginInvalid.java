package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC004_LoginInvalid extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Invalid Login";
		testDescription = "To verify user is not able to login the account with invalid credential (username and password)";
		category = "smoke";
		authors = "Vignesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void LoginInvalid()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig111")
		.clickContinue()
		.verifyInvalidPasswordErrorMessage("The Password you entered is incorrect.(Passwords are case sensitive. Is your Caps Lock On? Please check and try again.)")
		.enterEmailIdForLogin("aaavig111@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
		.verifyInvalidMailIdMessage("EMail-ID not registered. Please try a different ID.");
	}
}
