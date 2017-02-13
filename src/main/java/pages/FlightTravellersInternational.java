package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightTravellersInternational extends MakeMyTripWrappers{

	public FlightTravellersInternational(RemoteWebDriver driver, ExtentTest test){

		this.driver = driver;
		this.test = test;
		
		driver.getTitle();
		
		if(!verifyTitle("International Flights Air Tickets, Cheap International Air fares at MakeMyTrip")){

			reportStep("This page is not International Flight Travellers Page", "FAIL");
		}
	}

	public FlightTravellersInternational enterFirstNameInInternational(String firstName){

		enterByXpath("//div[@class='input-group']//input[1]", firstName);
		return this;
	}

	public FlightTravellersInternational enterSurNameInInternational(String surName){

		enterByXpath("//div[@class='input-group']//input[2]", surName);
		return this;
	}

	public FlightTravellersInternational enterPhoneNumberInInternational(String phoneNumber){

		enterByXpath("//div[@class = 'col-xs-10 col-md-9']/input", phoneNumber);
		return this;
	}
	
	public FlightTravellersInternational selectNationality(){
		
		return this;
	}

	public FlightTravellersInternational uncheckTravelServicesInInternational(){

		clickByXpath("//span[@class='MBlock']/span[1]/span[1]");
		clickByXpath("//span[@class='MBlock']/span[2]/span[1]");
		clickByXpath("//span[@class='MBlock']/span[3]/span[1]");
		clickByXpath("//span[@class='MBlock']/span[4]/span[1]");
		clickByXpath("//span[@class='MBlock']/span[5]/span[1]");
		return this;
	}

	public MakeMytripPayment clickPaymentInInternational() throws Throwable{

		clickByXpath("//span[@class='TND__sprite TND-icon-lock inlineB marR5']");
		return new MakeMytripPayment(driver, test);
	}


}
