package assignmentOneTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignmentOnePages.agentPage;
import assignmentOnePages.landingpage;
import assignmentOnePages.propertyPage;
import assignmentOnePages.searchResultPage;



public class TC_001 {
	
	static WebDriver driver;
	private String agentName;
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void SearchProperties() throws InterruptedException {
		
		
		landingpage lpage = PageFactory.initElements(driver, landingpage.class);
		lpage.searchLocation("London");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void printPropertyPrices() {
		
		searchResultPage rPage = PageFactory.initElements(driver, searchResultPage.class);
		rPage.printPricesByDescendingOrder();
		rPage.clickonfifthProperty();
	}
	@Test(priority=3)
	public void checkAgent() {
		
		propertyPage pPage = PageFactory.initElements(driver, propertyPage.class);
		agentName = pPage.getAgentName();
		pPage.clickOnAgent();
		
	}
	@Test(priority=4)
	public void verifyAgent() {
		
		agentPage aPage = PageFactory.initElements(driver, agentPage.class);
		aPage.verifyAgentName(agentName);
	}
	
	@AfterTest
	public void tearDownTest() {
		//driver.close();
		//driver.quit();
		System.out.println("Test Closed.");

	}

}
