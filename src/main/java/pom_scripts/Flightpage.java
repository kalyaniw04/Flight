package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Flightpage extends BasePage{

	public Flightpage(WebDriver driver) {
		super(driver);
		   
		
		
	}
	
	@FindBy(xpath="//a[.='Flights']")
	WebElement Flight;
	
	public void ClickFlightAction() {
		clickAction(Flight);
	}
	
	}


