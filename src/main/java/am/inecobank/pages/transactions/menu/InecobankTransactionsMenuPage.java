package am.inecobank.pages.transactions.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.inecobank.pages.home.InecobankMemberHomePage;

public class InecobankTransactionsMenuPage extends InecobankMemberHomePage{

	public InecobankTransactionsMenuPage(WebDriver driver) {
		super(driver);
	}

	public static final String historyXPath = "//a[@href='/vcDocument/List']";
	public static final String periodicalPaymentsXpath = "//a[@href='/vcPeriodicalContract/List']";
	public static final String STATEMENT_XPATH = "//a[@href='/vcOperation/List']";
	
	@FindBy(xpath = historyXPath)
	WebElement historyLink;
	
	public InecobankTransactionsHistoryPage navigateToHistory() {
		historyLink.click();
		return new InecobankTransactionsHistoryPage(driver);
	}
		@FindBy(xpath = periodicalPaymentsXpath)
		WebElement periodicalPaymentsLink;
		
		public InecobankPeriodicalPaymentsPage navigateToPeriodicalPayments() {
			periodicalPaymentsLink.click();
		return new InecobankPeriodicalPaymentsPage(driver);
		}
		
		@FindBy(xpath =STATEMENT_XPATH )
		WebElement statementLink;
		
		public InecobankStatementPage navigateToStatement() {
			statementLink.click();
			return new InecobankStatementPage(driver);
		
		
	}
}
