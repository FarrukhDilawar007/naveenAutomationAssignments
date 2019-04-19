package tests;

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

import pages.agentPage;
import pages.landingpage;
import pages.propertyPage;
import pages.searchResultPage;



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
		
		
	}
	@Test(priority=1)
	public void SearchProperties() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		landingpage lpage = PageFactory.initElements(driver, landingpage.class);
		lpage.searchLocation("London");
		Thread.sleep(5000);
		//js.executeScript("document.getElementsByClassName(\"ui-pricing__main-price ui-text-t4\").click();");
		driver.findElement(By.xpath("//iframe[@height='0']"))
		System.out.println(driver.findElement(By.xpath("//iframe[@height='0']")).getAttribute("display").toString());
		//WebElement element = driver.findElement(By.xpath("(//p[@class = 'ui-pricing__main-price ui-text-t4'])[5]"));
		//js.executeScript("arguments[0].click()", element);
		
		List<WebElement> priceTags =  driver.findElements(By.xpath("//p[@class = 'ui-pricing__main-price ui-text-t4']"));
		System.out.println(priceTags.size());
			
	}
//	@Test(priority=2)
//	public void printPropertyPrices() {
//		
//		searchResultPage rPage = PageFactory.initElements(driver, searchResultPage.class);
//		rPage.printPricesByDescendingOrder();
//		rPage.clickonfifthProperty();
//	}
//	@Test(priority=3)
//	public void checkAgent() {
//		
//		propertyPage pPage = PageFactory.initElements(driver, propertyPage.class);
//		agentName = pPage.getAgentName();
//		pPage.clickOnAgent();
//		
//	}
//	@Test(priority=4)
//	public void verifyAgent() {
//		
//		agentPage aPage = PageFactory.initElements(driver, agentPage.class);
//		aPage.verifyAgentName(agentName);
//	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Closed.");

	}

}
