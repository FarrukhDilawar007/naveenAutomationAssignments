package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class propertyPage {
	

	@FindBy(how = How.CLASS_NAME, using = "ui-agent__name")
	WebElement agentName;
	
	
	public String getAgentName() {
			return agentName.getText();
		}
	
	
	public void clickOnAgent() {		
		agentName.click();
	}

}
