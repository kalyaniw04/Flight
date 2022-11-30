package test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.Flightpage;

public class Flightscript1 extends Base_Test {
	
	@Test()
	
	public void testString( )throws IOException, InterruptedException{
		
		Flightpage fb=new Flightpage(driver);
		Thread.sleep(5000);
		fb.ClickFlightAction();
	}

}
