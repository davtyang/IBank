package am.inecobank.pages.base;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InecobankBasePageObject {
	protected WebDriver driver;
	
	public InecobankBasePageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}

	public void waitForElementPresent(String xPath) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		
	}
	
	public boolean verifyElementPresent(String xPath) {
		List<WebElement> element = driver.findElements(By.xpath(xPath));
		
		 return !element.isEmpty();
		
	}

}
