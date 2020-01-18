package am.inecobank.trasaction.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import am.inecobank.base.InecoBaseTest;
import am.inecobank.pages.home.InecobankGuestHomePage;
import am.inecobank.pages.home.InecobankMemberHomePage;
import am.inecobank.pages.signin.SignInPage;
import am.inecobank.pages.transactions.create.InecobankTransactionsNewPage;
import am.inecobank.pages.transactions.create.InecobankTransactionsToCard;
import am.inecobank.pages.transactions.menu.InecobankTransactionsHistoryPage;

public class TransactionsStructureTest extends InecoBaseTest {

	@BeforeTest
	public void logIn() {
		
		InecobankGuestHomePage home = new InecobankGuestHomePage(driver);
		SignInPage signin = home.clickOnSignInbutton();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		signin = signin.fillUsername(correctUsername);
		signin = signin.fillPassword(correctPassword);
		signin.clickLogin();
	}

	@Test
		public void transactionsHisotryStrucTest() {
			InecobankMemberHomePage member = new InecobankMemberHomePage(driver);
			InecobankTransactionsHistoryPage transactionsHistory = member.clickTransaction();
			transactionsHistory.validateHistoryStructure();
	
	
	}
	
	@Test
	public void transactionsTransferToCardStrucTest() {
		InecobankMemberHomePage member = new InecobankMemberHomePage(driver);
		member.clickTransaction();
		InecobankTransactionsNewPage newTransactions = new InecobankTransactionsNewPage(driver);
		InecobankTransactionsToCard transactionToCard = newTransactions.goToTransactionToCard();
		transactionToCard.validateTransactionToCardStructure();
		
		


}
}
