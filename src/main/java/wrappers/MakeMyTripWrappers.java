package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class MakeMyTripWrappers extends GenericWrappers{
	
	public String browserName;
	public String dataSheetName;
	public String url;
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	/*@BeforeTest
	public void beforeTest(){
		loadObjects();
	}*/
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName,url);
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	/*@AfterTest
	public void afterTest(){
		unloadObjects();
	}*/
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		
		//return new Object[][]{{"DemoSalesManager","crmsfa","GSR","j","h","Media","Partnership"},{"DemoSalesManager","crmsfa","GSR","nnn","mmmm","Media","Partnership"}};
		return DataInputProvider.getSheet(dataSheetName);		
	}
	
	
	public void departureDate()
	{		
		driver.findElementById("start_date_sec").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByLinkText("23").click();
		
	}
	
	public void returnDate()
	{
		driver.findElementById("return_date_sec").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		driver.findElementByLinkText("26").click();
	}

}
