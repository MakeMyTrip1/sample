package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC006_ResetPasswordAndLogin extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Reset Password and Again Relogin";
		testDescription = "To verify user is able to get reset password and login the account with the new password";
		category = "Smoke";
		authors = "Pakeer";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
	
	@Test
	public void ResetPasswordAndLogin() throws InterruptedException
	{
		new Dashboard(driver, test)
		.clickLoginMenu()
		.clickForgotPassword()
		.enterEmailInForgotPassword("vigaac@yopmail.com")
		.clickSubmitButton()
		.LoadYopMail()
		.Entermailid("vigaac@yopmail.com")
		.CheckInboxbutton()
		.CheckForMailButton()
		.Clicklink()
		.EnterNewPassword("vigaac")
		.RetypePassword("vigaac")
		.ClickSubmitButton()
		.enterEmailAddressAndPassword("vigaac@yopmail.com","vigaac")
		.clickLoginButton();
	
	}
}
