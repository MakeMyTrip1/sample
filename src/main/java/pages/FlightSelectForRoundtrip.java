package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightSelectForRoundtrip extends MakeMyTripWrappers {

	public FlightSelectForRoundtrip(RemoteWebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Flight Split Listing View")) {

			reportStep("This is not Round Trip page", "FAIL");
		}
	}
	public FlightSelectForRoundtrip selectNoOfStopsInRT(){

		clickById("stops_0_dep");
		return this;

	}

	public FlightSelectForRoundtrip selectTimingInRT(){

		clickById("buckets_noon_dep");
		return this;
	}

	public FlightSelectForRoundtrip selectAirlinesInRT(){

		clickById("aln_G8_dep");
		return this;
	}

	public FlightSelectForRoundtrip selectModifySearchInRT(){

		clickByXpath("//div[@class= 'col-md-2 col-sm-2 modify']/a");		
		return this;
	}

	public FlightSelectForRoundtrip modifyToCityInRT(String toCity){

		enterByXpath("//div[@class='multicity_wrapper clearfix']/div[3]//input[2]", toCity);
		return this;
	}

	public FlightSelectForRoundtrip submitModifiedCityInRT(){

		clickByLink("Search");
		return this;
	}

	public FlightsReview selectBookButton(){
		
		clickByLink("Book");
		return new FlightsReview(driver, test);
	}

	public FlightSelectForRoundtrip selectDepatureFlight(){

		clickByXpath("//div[@class='main col-lg-9 col-md-9 col-sm-12 col-xs-12']/div[2]/div[1]/div/div/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]");
		return this;	
	}

	public FlightSelectForRoundtrip selectReturnFlight(){

		clickByXpath("//div[@class='main col-lg-9 col-md-9 col-sm-12 col-xs-12']/div[2]/div[2]/div/div/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]");
		return this;
	}
}





