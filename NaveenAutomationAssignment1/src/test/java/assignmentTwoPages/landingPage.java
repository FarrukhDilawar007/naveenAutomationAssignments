package assignmentTwoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class landingPage {
	
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Round Trip')]")
	WebElement roundTrip;
	
	@FindBy(how = How.ID, using = "fromCity")
	WebElement fromCity;
	
	@FindBy(how = How.ID, using = "toCity")
	WebElement toCity;
	
	@FindBy(how = How.ID, using = "departure")
	WebElement departureDate;
	
	@FindBy(how = How.ID, using = "return")
	WebElement returnDate;
	
	//
	By dateSelectionbyXpath = By.xpath("//div[@class = 'dateInnerCell']//p[contains(text(),'29')]");
	
	//verify selected date with aria-selected attribute - It will be true if date is selected.
	
	//Search For Flights
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Search')]")
	WebElement searchNow;
	
	
	//Departure Flight Price at Footer
	@FindBy(how = How.XPATH, using = "//div[@class = 'splitVw-footer-left ']//p[@class = 'actual-price']")
	WebElement FooterDeptPrice;
	
	//Return Flight Price at Footer
	@FindBy(how = How.XPATH, using = "//div[@class = 'splitVw-footer-right ']//p[@class = 'actual-price']")
	WebElement FooterRetPrice;
	
	//Total Price of the Flight
	@FindBy(how = How.XPATH, using = "//div//span[@class = 'splitVw-total-fare']")
	WebElement flightTotalPrice;
	
	
	@FindBy(how = How.XPATH, using = "//p[@class= 'dept-city' and contains(text(),'New Delhi')]")
	List<WebElement> departureFlights;
	
	
	//count no of return flights
	//p[@class= 'dept-city' and contains(text(),'Bengaluru')]
	
	

	

}
