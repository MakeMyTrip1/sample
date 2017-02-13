package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class Yopmail extends MakeMyTripWrappers{
	
		public Yopmail(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;
			if(!verifyTitle("YOPmail - Disposable Email Address")){
				reportStep("This is not YOPmail home Page", "FAIL");
			}
		}
		
			
		public Yopmail Entermailid (String data){
			enterById("login", data);
			return this;
		}
			
		public Yopmailinbox CheckInboxbutton(){	
			clickByXpath("//input[@class='sbut']");
			return new Yopmailinbox (driver, test);
		}		
		
		
}
