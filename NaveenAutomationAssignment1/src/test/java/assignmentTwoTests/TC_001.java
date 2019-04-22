package assignmentTwoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignmentOnePages.agentPage;
import assignmentOnePages.landingpage;
import assignmentOnePages.propertyPage;
import assignmentOnePages.searchResultPage;

public class TC_001 {

	static WebDriver driver;
	
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void SearchProperties() throws InterruptedException {
		
		
	
	}
	
	@AfterTest
	public void tearDownTest() {
		//driver.close();
		//driver.quit();
		System.out.println("Test Closed.");

	}
	
}
