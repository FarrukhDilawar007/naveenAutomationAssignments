package assignmentOnePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class landingpage {
	
	
	@FindBy(how = How.NAME, using = "q")
	WebElement searchText;
	
	public void searchLocation(String loc) {
		
		searchText.sendKeys(loc); 
		searchText.sendKeys(Keys.ENTER);
		
	}

}
