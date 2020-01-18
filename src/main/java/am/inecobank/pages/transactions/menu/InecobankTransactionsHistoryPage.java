package am.inecobank.pages.transactions.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.*;
public class InecobankTransactionsHistoryPage extends InecobankTransactionsMenuPage {

	public InecobankTransactionsHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = DATE_FROM_XPATH)
	WebElement dateFrom;
	
	public void validateHistoryStructure() {

		Assert.assertTrue(verifyElementPresent(DATE_FROM_XPATH), "date from is not present");		
		Assert.assertTrue(verifyElementPresent(DATE_TO_XPATH), "date to is not present");	
		Assert.assertTrue(verifyElementPresent(DOCUMENT_TYPE_XPATH), "doc type is not present");	
		Assert.assertTrue(verifyElementPresent(DOCUMENT_STATE_XPATH), "doc state is not present");
		Assert.assertTrue(verifyElementPresent(FROM_ACCOUNT_XPATH), "from account is not present");
		Assert.assertTrue(verifyElementPresent(BENEFICIARY_XPATH), "beneficiary is not present");
		Assert.assertTrue(verifyElementPresent(RESET_XPATH), "reset is not present");
		Assert.assertTrue(verifyElementPresent(SEARCH_XPATH), "search is not present");
		Assert.assertTrue(verifyElementPresent(DOCUMENT_MAINTABLE_XPATH), "document maintable is not present");
		

		
		

		

		
		

	}

}
