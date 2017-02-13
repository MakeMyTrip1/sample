package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DomesticFlight;
import wrappers.MakeMyTripWrappers;

public class TC022_VerifyTheInValidCouponCodeErrorMessage extends MakeMyTripWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Verify Invalid CouponCode";
		testDescription = "To verify error message is displayed on entering invalid coupon code";
		category = "smoke";
		authors = "Rajesh";
		url="https://www.makemytrip.com/flights";
		dataSheetName = "TC022";
	}

	@Test
	public void verifyInvalidCoupon() throws Throwable{

		new DomesticFlight(driver, test)
		.clickOneWayTrip()
		.enterDepartureCity("Chennai (MAA)")
		.enterDestinationCity("Kolkata (CCU)")
		.selectDepartureDate()
		.clickSearchFlight()
		.selectBookButton()
		.enterInvalidCoupon("FEB1928")
		.clickApplyButtton()
		.verifyCouponErrorMessage("Sorry, e-Coupon can not be used now. Please remove the value for the Ecoupon number and continue with flight booking");

	}

}
