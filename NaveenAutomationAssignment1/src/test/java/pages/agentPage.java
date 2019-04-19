package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class agentPage {
	
	
	@FindBy(how = How.XPATH, using = "//h1")
	WebElement AgentName;

	public void verifyAgentName(String expectedAgentName) {
		Assert.assertEquals(AgentName.getText(), expectedAgentName);
		System.out.println("Agent Verified.");
	}
	
}
