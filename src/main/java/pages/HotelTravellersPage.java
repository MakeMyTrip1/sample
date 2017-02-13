package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class HotelTravellersPage extends MakeMyTripWrappers {

	public HotelTravellersPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;	
		if(!verifyTitle("Online Hotel Booking for Cheap, Budget & Luxury Hotels in India | MakeMyTrip.com")){
			reportStep("This is not the URL ", "FAIL");
}
}

  //Enter first name
	public HotelTravellersPage Enterfirstname(String data){
		enterById("firstName", data);
		return this;
	}
	
	//Enter Last name
		public HotelTravellersPage Enterlastname(String data){
			enterById("lastName", data);
			return this;
		}
		
		
   //Enter Email id in the Email text box
	public HotelTravellersPage EnterEmailID(String data){
		enterById("email", data);
		return this;
	}
	
	//Enter mobile number
			public HotelTravellersPage EnterMobilenumber(String data){
				enterById("mobile_traveller", data);
				return this;
			}
	
	//Click on "Continue to Payment" button
			public HotelTravellersPage ClickPaymentbutton(){
				clickByXpath("(//button[@class='btn btn-block btn-lg btn-primary-red'])[5]");
				return this;
			}
	
}


