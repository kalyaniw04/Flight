package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage2 extends BasePage{

	public FlightPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//span[.='Flights']")
	WebElement Flight;
	
	public void ClickFlightAction() {
		clickAction(Flight);
	}
	
	
	@FindBy(xpath="//iframe[contains(@id,'frame') and not(@title)]")
	WebElement Frame;
	
	public WebElement getFrameElement() {
		return Frame;
	}
	
	
	@FindBy(xpath="//div[@data-value='roundtrip']")
	WebElement roundtrip;
	
	public void ClickroundtripAction() {
		clickAction(roundtrip);
	}
	@FindBy(xpath="//div[@data-placeholder='To?' and contains(@id,'destination-airport-display')]")
    WebElement To;
    
    public void ClickToAction() {
    	clickAction(To);
    	
    }
    
    
    @FindBy(name="destination")
    WebElement destination;
    
    public void enterdestination(String Mumbai) {
    	enter_value(destination,Mumbai);
    
    }
    
    @FindBy(xpath="//div[@class='item-info']")
    WebElement item;
    
    public void ClickitemAction() {
    	clickAction(item);
    }
    
    
    @FindBy(xpath="//div[@class='_iaf _iEU _iam _iai']")
    WebElement calender;
    
    public void ClickcalenderAction() {
    	clickAction(calender);
    	
    }
    
    @FindBy(xpath="(//div[text()='6'])[3]")
    WebElement date;
    public void ClickdateAction() {
    	clickAction(date);
    }
    
    @FindBy(xpath="(//div[@class='_ia1 _iBD _iai'])[2]")
    WebElement Return;
    public void ClickReturnAction() {
    	clickAction(Return);
    }
    
    
    @FindBy(xpath="(//div[text()='23'])[3]")
    WebElement dte;
    public void ClickdteAction() {
    	clickAction(dte);
    }
    
    @FindBy(xpath="(//div[@data-value='e'])[1]")
    WebElement economy;
    public void ClickeconomyAction() {
    	clickAction(economy);
    }
    
    @FindBy(xpath="//span[@class='symbol ']")
    WebElement symbol;
    public void ClicksymbolAction() {
    	clickAction(symbol);
    }
    
    @FindBy(xpath="//div[@class='col js-label _iat _iiN _ifT _ifS _idj']")
    WebElement adult;
    public void ClickadultAction() {
    	clickAction(adult);
    }
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[1]")
    WebElement button;
    public void ClickbuttonAction() {
    	clickAction(button);
    }
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[4]")
    WebElement btn;
    public void ClickbtnAction() {
    	clickAction(btn);
    }
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[3]")
    WebElement btnn ;
    public void ClickbtnnAction() {
    	clickAction(btnn);
    }
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[5]")
    WebElement btn1 ;
    public void Clickbtn1Action() {
    	clickAction(btn1);
    }
    
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[6]")
    WebElement btn2 ;
    public void Clickbtn2Action() {
    	clickAction(btn2);
    }
    @FindBy(xpath="(//button[@class='Common-Widgets-Button-StyleJamButton Button-Gray-Shadow ui-button size-m stylejam incrementor-js _jS4 _iad _iaa _ieE _iqk _ieB _ib4 _id7 _ia1 _ib3 _ihr _ihs _h-Y _idj _im4 _ihp _ihq _jUV _jT5 _jT6 _jUW _jT7 _jUX _jUY _jT8 _jUS _jUT _jUU _jT4 _jT- _jU0 _ipf _ipg _iKU _iKV _jUa _jUZ _jT9 _jU2 _jUB'])[7]")
    WebElement btn3;
    public void Clickbtn3tAction() {
    	clickAction(btn3);
    }
    @FindBy(xpath="//button[@title='Search flights']")
    WebElement search;
    public void ClicksearchAction() {
    	clickAction(search);
    }
    @FindBy(xpath="(//div[@class='_iKN _iae _igf _ibA _ian _iai _i3E _ia- _igO'])[1]")
    WebElement chepest;
    public void ClickchepestAction() {
    	clickAction(chepest);
    }
    
    
    
    @FindBy(xpath="(//div[@class='_iKN _iae _igf _ibA _ian _iai _i3E _ia- _igO'])[2]")
    WebElement book;
    public void ClickbookAction() {
    	clickAction(book);
    }
    
    @FindBy(xpath="(//div[@class='_iKN _iae _igf _ibA _ian _iai _i3E _ia- _igO'])[3]")
    WebElement quick;
    public void ClickquickAction() {
    	clickAction(quick);
    }
    @FindBy(xpath="//div[text()='Other sort']")
    WebElement sort;
    public void ClicksortAction() {
    	clickAction(sort);
    }
    
    @FindBy(xpath="//li[@aria-label='Earliest landing ()'][1]")
    WebElement landing;
    public void ClicklandingAction() {
    	clickAction(landing);
    }
    @FindBy(xpath="(//label[@class='label'])[1]")
    WebElement nonstop ;
    public void ClicknonstopAction() {
    	clickAction(nonstop);
    }
    
   
    
    @FindBy(xpath="(//span[@class='icon plus _jVE _ig1 _ig2'])[1]")
    WebElement carrybag ;
    public void ClickcarrybagAction() {
    	clickAction(carrybag);
    }
    @FindBy(xpath="(//span[@class='icon plus _jVE _ig1 _ig2'])[2]")
    WebElement checkedbag ;
    public void ClickcheckedbagAction() {
    	clickAction(checkedbag);
    }
    
    @FindBy(xpath="(//span[@class='label-text '])[2]")
    WebElement time ;
    public void ClicktimeAction() {
    	clickAction(time);
    }
    
    
    
    

	

}
