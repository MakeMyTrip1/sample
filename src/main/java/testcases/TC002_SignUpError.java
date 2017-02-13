package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC002_SignUpError extends MakeMyTripWrappers
{
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Signup error";
		testDescription = "To verify error message is displayed if there is mismatch in enter password and confirm password field (Sign- Up)";
		category = "smoke";
		authors = "Vignesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void signUpError()
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.clickCreateNewUser()
		.enterNewEmailId("aaavig@yopmail.com")
		.enterNewPassword("aaavig")
		.enterConfirmPassword("aaavig123")
		.verifyErrorInConfirmPassword("The Password and the Confirm Password don't match.");
		
	}
}
