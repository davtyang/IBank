package am.inecobank.pages.transactions.menu;

import static am.inecobank.pages.transactions.menu.InecobankPeriodicalPaymentsPageConstants.*;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.RESET_XPATH;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.SEARCH_XPATH;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InecobankPeriodicalPaymentsPage extends InecobankTransactionsMenuPage {

	public InecobankPeriodicalPaymentsPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = DOCUMENT_TYPE_ID_XPATH) 
		WebElement periodicalPaymentsLink;
		
		public void validatePeriodicalPaymentStructure() {
			Assert.assertTrue(verifyElementPresent(DOCUMENT_TYPE_ID_XPATH), "document type Id is not present");
			Assert.assertTrue(verifyElementPresent(PERIOD_TYPE_ID_XPATH), "period type Id is not present");
			Assert.assertTrue(verifyElementPresent(PERIODICAL_CONTRACT_STATE_ID_XPATH), "periodical conttract state is not present");
			Assert.assertTrue(verifyElementPresent(DETAILS_XPATH ), "detalis is not present");
			Assert.assertTrue(verifyElementPresent(RESET_XPATH), "reset is not present");
			Assert.assertTrue(verifyElementPresent(SEARCH_XPATH), "search is not present");
			Assert.assertTrue(verifyElementPresent(PERIODICALCONTRACT_MAINTABLE_XPATH), "periodical contract main table is not present");

			



			
		
		
		
		
		}		
	
}
	


