package am.inecobank.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.base.InecobankBasePageObject;
import am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPage;

public class InecobankMemberHomePage extends InecobankBasePageObject{

	public InecobankMemberHomePage(WebDriver driver) {
		super(driver);
	}
		public final String TRANSACTION_BTN = "//a[text()='Transactions']";
		@FindBy(xpath = TRANSACTION_BTN)
		WebElement transActionBtnclick;
		
		public InecobankTransactionsHistoryPage clickTransaction () {
			waitForElementPresent(TRANSACTION_BTN);
			transActionBtnclick.click();
			return new InecobankTransactionsHistoryPage(driver);
			
		}
		
	
		
	}


