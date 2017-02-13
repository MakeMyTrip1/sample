package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class InternationalHotel extends MakeMyTripWrappers {

	public InternationalHotel(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test = test;
		if(!verifyTitle("Book International Hotels Online | Get Discounts & Offers for Cheap, Budget & Luxury Hotels Worldwide | MakeMyTrip")){
			reportStep("This is not International Hotel Page", "FAIL");
		}
	}
	
	//enter city
		public InternationalHotel enterCity(String cityName)
		{
			enterById("from_city_data_box", cityName);
			driver.findElementById("from_city_data_box").sendKeys(Keys.TAB);
			return this;
		}
		
		//enter checkin date
		public InternationalHotel enterCheckInDate()
		{
			departureDate();
			return this;
		}
		
		//enter checkout date
		public InternationalHotel enterCheckOutDate()
		{
			returnDate();
			return this;
		}
		
		
		//select adults in hotel
		public InternationalHotel selectNoOfAdultsInHotel(int no_Of_Adults)
		{
			for (int i = 1; i < no_Of_Adults; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[2]");	
			}		
			return this;
		}
		
		//decrease no of adults in hotel
		public InternationalHotel decreaseNoOfAdultsInHotel(int no_Of_Adults)
		{
			for (int i = 1; i < no_Of_Adults; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[1]");	
			}		
			return this;
		}
		
		//select no of children in hotel
		public InternationalHotel selectNoOfChildrenInHotel(int no_Of_Children)
		{
			for (int i = 1; i < no_Of_Children; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[4]");	
			}		
			return this;
		}
		
		//decrease no of children
		public InternationalHotel decreaseNoOfChildrenInHotel(int no_Of_Children)
		{
			for (int i = 1; i < no_Of_Children; i++) {
				clickByXpath("(//div[@class='segmented_controls make_field form-control']/a)[3]");	
			}		
			return this;
		}
		
		//select Search hotels button
		public HotelSelect clickSearchHotel()
		{
			clickById("hotels_submit");
			return new HotelSelect( driver,  test);
		}
}
