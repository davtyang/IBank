package am.inecobank.pages.transactions.create;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InecobankTransactionsToCard extends InecobankTransactionsNewPage {

	public InecobankTransactionsToCard(WebDriver driver) {
		super(driver);
	}
	public static final String TRANSFER_FROM_XPATH = "//input[@name='txtFromAccount']";
	
	public void validateTransactionToCardStructure() {
		Assert.assertTrue(verifyElementPresent(TRANSFER_FROM_XPATH));
		
		
	}

}
