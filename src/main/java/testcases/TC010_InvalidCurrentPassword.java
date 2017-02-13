package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC010_InvalidCurrentPassword extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Invalid Current Password Error Message";
		testDescription = "To verify error message is displayed if invalid current password is entered";
		category = "smoke";
		authors = "Vignesh";	
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void InvalidCurrentPassword() throws InterruptedException
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.enterEmailIdForLogin("aaavig@yopmail.com")
		.enterPasswordForLogin("aaavig")
		.clickContinue()
		.clickLoginMenu()
		.clickMyProfile()
		.MySettings()
		.OldPassword("aaavig1")
		.NewPassword("aaavig")
		.ReconfirmPassword("aaavig")
		.PasswordSubmitbutton()
		.VerifyPasswordNotCorrectTextErrorMsg("The old Password is not correct");
	}
}



	

