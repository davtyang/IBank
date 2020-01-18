package am.inecobank.signin;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.inecobank.base.InecoBaseTest;
import am.inecobank.pages.home.InecobankGuestHomePage;
import am.inecobank.pages.home.InecobankMemberHomePage;
import am.inecobank.pages.signin.SignInPage;

public class SignInPageTest extends InecoBaseTest {

	@Test
	public void signinWithCorrectCredentialsTest() {
		InecobankGuestHomePage home = new InecobankGuestHomePage(driver);
		SignInPage signin = home.clickOnSignInbutton();
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));
		   
		signin = signin.fillUsername(correctUsername);
		signin = signin.fillPassword(correctPassword);
		InecobankMemberHomePage memberHome = signin.clickLogin();
		Assert.assertTrue(memberHome.verifyElementPresent(memberHome.TRANSACTION_BTN));

	}
}
