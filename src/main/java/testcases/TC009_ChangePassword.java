package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC009_ChangePassword extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Able to successfully change password in Profile page";
		testDescription = "To verify user is able to change password from profile page";
		category = "smoke";
		authors = "Vignesh";	
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void ChangePassword() throws InterruptedException
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
		.clickLoginMenu()
		.clickMyProfile()
		.MySettings()
		.OldPassword("aaavig")
		.NewPassword("aaavig")
		.ReconfirmPassword("aaavig")
		.PasswordSubmitbutton()
		.VerifyPasswordChangedTextMsg("Your Password has been Changed.");
	}
}


