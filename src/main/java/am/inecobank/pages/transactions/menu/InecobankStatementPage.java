package am.inecobank.pages.transactions.menu;
import static am.inecobank.pages.transactions.menu.InecobankStatementPageCostants.*;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.DATE_FROM_XPATH;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.DATE_TO_XPATH;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.RESET_XPATH;
import static am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPageConstants.SEARCH_XPATH;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InecobankStatementPage extends InecobankTransactionsMenuPage {

	public InecobankStatementPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath = DATE_FROM_XPATH)
	WebElement statementLink;
	
	public void validateStatementStructure() {
		Assert.assertTrue(verifyElementPresent(DATE_FROM_XPATH), "date from is not present");
		Assert.assertTrue(verifyElementPresent(DATE_TO_XPATH), "date to is not present");
		Assert.assertTrue(verifyElementPresent(ACCOUNT_XPATH), "account is not present");
		Assert.assertTrue(verifyElementPresent(CURRENCY_XPATH), "currency is not present");
		Assert.assertTrue(verifyElementPresent(AMOUNT_XPATH), "amount is not present");
		Assert.assertTrue(verifyElementPresent(DEBITORCREDIT_XPATH), "debit or credit is not present");
		Assert.assertTrue(verifyElementPresent(DEBITORCREDITEND_XPATH), "debit or credit end is not present");
		Assert.assertTrue(verifyElementPresent(DETAILS_XPATH), "details is not present");
		Assert.assertTrue(verifyElementPresent(RESET_XPATH), "reset is not present");
		Assert.assertTrue(verifyElementPresent(SEARCH_XPATH), "search is not present");
		Assert.assertTrue(verifyElementPresent(OPERATION_MAINTABLE_XPATH), "operation main table is not present");

		








	}
		
		
	}


