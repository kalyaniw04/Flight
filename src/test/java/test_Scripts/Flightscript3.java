package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.BasePage;
import pom_scripts.FlightPage2;
import pom_scripts.FlightPage3;

public class Flightscript3 extends Base_Test
{
	@Test(dataProvider="testData")
	public void testString(String[]testData)throws IOException{
	
		FlightPage3 fb=new FlightPage3(driver);
		fb.ClickFlightAction();
		fb.switchToASpecificTitledWindow(driver,"Cheap Flights, Airline Tickets & Airfare Deals | trivago");
		driver.switchTo().frame(fb.getFrameElement());
        fb.ClickroundtripAction();
        fb.ClickonewayAction();
        fb.ClickToAction();
        fb.enterdestination(testData[0]);
        fb.ClickitemAction();
        fb.ClickcalenderAction();
        fb.ClickdateAction();
       fb.ClickeconomyAction();
        fb.ClickpreAction();
        fb.ClickadultAction();
        fb.ClickbuttonAction();
        fb.ClickbtnAction();
        fb.ClickbtnnAction();
        fb.Clickbtn1Action();
        fb.Clickbtn2Action();
        fb.Clickbtn3tAction();
        fb.ClicksearchAction();
        fb.ClickchepestAction();
        fb.ClickbookAction();
        fb.ClickquickAction();
        fb.ClicksortAction();
        fb.ClicklandingAction();
        fb.ClicknonstopAction();
        fb.ClickcarrybagAction();
        fb.ClickcheckedbagAction();
        
	}
       
	


		
	
	@DataProvider(name="testData")
	public Object[][] getTestData() throws IOException{
	Object[][]testdata=ReadExcel.getMultipleData("Sheet2");
	return testdata;
}
}


