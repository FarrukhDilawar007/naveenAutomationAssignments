package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchResultPage {
	
		public WebDriver driver;
	
		public searchResultPage(WebDriver driver) {
			this.driver = driver;
		}
	

		public void printPricesByDescendingOrder() {
		System.out.println(driver.getTitle());	
		
		ArrayList<String> obtainedPrices = new ArrayList<String>();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class = 'ui-pricing__main-price ui-text-t4']")));
		
		List<WebElement> priceTags =  driver.findElements(By.xpath("//p[@class = 'ui-pricing__main-price ui-text-t4']"));
		System.out.println(priceTags.size());
		
		for(WebElement element:priceTags) {
			obtainedPrices.add(element.getText());
		}
		
		Collections.sort(obtainedPrices, Collections.reverseOrder());
		
		for(int i=0; i<=obtainedPrices.size();i++) {
			System.out.println(obtainedPrices.get(i));				
		}
		
	}
		
			public void clickonfifthProperty() {
		
				driver.findElement(By.xpath("(//p[@class = 'ui-pricing__main-price ui-text-t4'])[5]")).click();
		}
	
}
