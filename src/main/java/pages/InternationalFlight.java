package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class InternationalFlight extends MakeMyTripWrappers{

	public InternationalFlight(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test = test;
		if(!verifyTitle("International Flights, Cheap International Air Tickets Booking, Lowest International Airfare | MakeMyTrip India")){
			if(!verifyTitle("Cheap Air Tickets, Flight Ticket Booking of Domestic Flights at Lowest Airfare: MakeMyTrip")){
				reportStep("This is not Domestic Flight Page", "FAIL");

			}
		}
	}

	//click one_way trip
	public InternationalFlight clickOneWayTrip()
	{
		clickById("one_way_button1");
		return this;
	}

	//click round trip
	public InternationalFlight clickRoundTrip()
	{
		clickById("round_trip_button1");
		return this;
	}

	//enter departure city
	public InternationalFlight enterDepartureCity(String departure_city)
	{
		enterById("from_typeahead1", departure_city);
		//driver.findElementByXPath("//input[@id='from_typeahead1']").sendKeys(Keys.TAB);
		return this;
	}

	//enter Destination city
	public InternationalFlight enterDestinationCity(String destination_city)
	{
		enterById("to_typeahead1", destination_city);
		//driver.findElementByXPath("//input[@id='to_typeahead1']").sendKeys(Keys.TAB);
		return this; 
	}

	//select departure date
	public InternationalFlight selectDepartureDate()
	{
		departureDate();
		return this;
	}

	//select return date
	public InternationalFlight selectReturnDate()
	{
		returnDate();
		return this;
	}

	//Selecting no.of adults
	public InternationalFlight selectNoOfAdults(int no_Of_Adults)
	{
		for(int i=1;i<=no_Of_Adults;i++)
		{
			driver.findElementByXPath("//div[@id='adult_count']/a[2]").click();	
		}		
		return this;
	}

	//decrease no.of adults
	public InternationalFlight decreaseNoOfAdults(int no_Of_Adults)
	{
		for(int i=1;i<=no_Of_Adults;i++)
		{
			driver.findElementByXPath("//div[@id='adult_count']/a[1]").click();	
		}
		return this;
	}

	//Selecting no.of children
	public InternationalFlight selectNoOfChildren(int no_Of_Children)
	{
		for(int i=1;i<=no_Of_Children;i++)
		{
			driver.findElementByXPath("//div[@id='child_count']/a[2]").click();	
		}		
		return this;
	}

	//decrease no.of children
	public InternationalFlight decreaseNoOfChildren(int no_Of_Children)
	{
		for(int i=1;i<=no_Of_Children;i++)
		{
			driver.findElementByXPath("//div[@id='child_count']/a[1]").click();	
		}		
		return this;
	}

	//Selecting no.of Infant
	public InternationalFlight selectNoOfInfant(int no_Of_Infant)
	{
		for(int i=1;i<=no_Of_Infant;i++)
		{
			driver.findElementByXPath("//div[@id='infant_count']/a[2]").click();	
		}		
		return this;
	}

	//decrease no of infant
	public InternationalFlight decreaseNoOfInfant(int no_Of_Infant)
	{
		for(int i=1;i<=no_Of_Infant;i++)
		{
			driver.findElementByXPath("//div[@id='infant_count']/a[1]").click();	
		}		
		return this;
	}

	//select search flight button
	public FlightSelectForInternational clickSearchFlightInternational()
	{
		clickById("flights_submit");
		return new FlightSelectForInternational( driver,  test);
	}



}
