package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightsTraveller extends MakeMyTripWrappers {

	public FlightsTraveller(RemoteWebDriver driver, ExtentTest test){

		this.driver = driver;
		this.test = test;
		System.out.println(driver.getTitle());
		if(!verifyTitle("Flights Traveller"))
		{			
			reportStep("This is not Flight Review page", "FAIL");
		}

	}

	public FlightsTraveller enterFirstName(String firstName){

		enterByXpath("//span[@class='first_name col-lg-5 col-md-5 col-sm-4 col-xs-12']/input", firstName);
		return this;
	}

	public FlightsTraveller enterLastName(String lastName){

		enterByXpath("//span[@class='last_name col-lg-5 col-md-5 col-sm-4 col-xs-12 row']/input", lastName);
		return this;
	}

	public FlightsTraveller selectGenderMale(){

		clickByLink("MALE");
		return this;
	}

	public FlightsTraveller selectGenderFemale(){

		clickByLink("FEMALE");
		return this;
	}

	public FlightsTraveller enterPhoneNumber(String phoneNumber){

		enterByXpath("//span[@class='pull-left col-lg-6 col-md-6 col-sm-7 col-xs-8 row phone_number phone_number_row']/input", phoneNumber);
		return this;
	}

	public MakeMytripPayment selectContinueToPaymaent() throws Throwable{

		
		clickByLink("Continue to payment");
		
		return new MakeMytripPayment(driver, test);
	}

}
