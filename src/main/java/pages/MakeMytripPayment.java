package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class MakeMytripPayment extends MakeMyTripWrappers{

	public MakeMytripPayment(RemoteWebDriver driver, ExtentTest test) throws Throwable{

		this.driver = driver;
		this.test =test;
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Thread.sleep(6000);
		if(!verifyTitle("MakeMytrip Payment : Safe and Secure")){
			reportStep("This is not payment page", "FAIL");
			
		}
	}


}
