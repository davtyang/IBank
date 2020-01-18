package am.inecobank.pages.transactions.create;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.home.InecobankMemberHomePage;

public class InecobankTransactionsNewPage extends InecobankMemberHomePage {

	public InecobankTransactionsNewPage(WebDriver driver) {
		super(driver);
	}

	public static final String TRANSFER_TO_CARD_XPATH = "//a[@href='/TransferToCard']";
	
	
	@FindBy(xpath = TRANSFER_TO_CARD_XPATH)
	WebElement transferToCardLink;
	
	public InecobankTransactionsToCard goToTransactionToCard() {
		transferToCardLink.click();
		return new InecobankTransactionsToCard(driver);
	}
}
