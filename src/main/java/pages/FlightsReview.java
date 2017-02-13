package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class FlightsReview extends MakeMyTripWrappers{

	public FlightsReview(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Flights Review"))
		{			
			reportStep("This is not Flight Review page", "FAIL");
		}

	}


	public FlightsReview enterInvalidCoupon(String invalidCoupon){

		clickByXpath("(//div[@class='input-group coupon_scope'])[2]");
		enterByXpath("//div[@class = 'col-sm-12 mobile_fullwidth']//input", invalidCoupon);
		return this;
	}
	public FlightsReview clickApplyButtton(){

		clickByLink("Apply");
		return this;
	}

	public FlightsReview verifyCouponErrorMessage(String erroMessage){

		System.out.println(driver.findElement(By.xpath("//span[@class='promo_txt ng-binding']")).getText());
		verifyTextByXpath("//span[@class='promo_txt ng-binding']", erroMessage);
		return this;
	}

	public FlightsReview closeErrorMessage(){

		clickByXpath("//div[@class = 'alert alert-danger error_case alert_coupon_sidebar clearfix']/button");
		return this;
	}

	public FlightsReview selectInsurance(){

		clickByXpath("//label[@class='yes_insure']/span[1]");
		return this;
	}

	public FlightsReview selectInsuranceRiskMyTrip(){

		clickByXpath("//label[@class='no_insure']/span[1]");
		return this;
	}

	public FlightsReview clickInsuranceBenifits(){

		clickByXpath("//span[@class = 'fare_ruleicn']/../span");
		return this;
	}

	public FlightsReview enterContactInfo(String enterEmail){

		enterByXpath("//div[@class='col-lg-4 col-md-5 col-sm-6 col-xs-8']/input", enterEmail);
		return this;
	}

	public FlightsReview  clickAgreeCheckBox(){

		clickByXpath(" //div[@class='col-lg-11 col-md-11 col-sm-12 row']/span[1]");
		return this;
	}

	public FlightsTraveller clickContinueAsGuest(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Continue as Guest"))));
		clickByLink("Continue as Guest");
		return new FlightsTraveller(driver, test);
	}

	public FlightsReview alertHandle(){

		acceptAlert();
		return this;
	}

	public FlightsReview closeConfirmInsurance(){

		clickByXpath(" //p[@class = 'overlay_heading re_buying_insurance RobotoMedium clearfix']/a");
		return this;
	}	

	public FlightsTraveller selectSecureMytripButton(){

		clickByLink("Yes, Secure my trip with insurance");
		return new FlightsTraveller(driver, test);
	}

	public FlightsTraveller selectRiskMytripButton(){

		clickByLink("No, I am willing to risk my trip");
		return new FlightsTraveller(driver, test);
	}

	public FlightsReview clickLoginAndContinue(){

		clickByLink("Login & Continue");
		return this;
	}

	public FlightsReview enterLoginId(String enterUserName){

		enterById("username", enterUserName);
		//driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		return this;
	}

	public FlightsReview enterPassword(String enterPassword){

		//clickById("password_text");
		clickByXpath("//*[@id='login_form_0']/p[2]/span[1]");
		//enterById("password", enterPassword);
		enterByXpath("//*[@id='password']", enterPassword);
		return this;
	}

	public FlightsTraveller clickLoginButton(){
		try{

			clickByXpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div[2]/form/p[4]/input");

		}catch (Exception e) {

			clickByXpath("//*[@id='login_btn']");
		}

		return new FlightsTraveller(driver, test);
	}
}
