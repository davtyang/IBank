package am.inecobank.signin;

import org.testng.annotations.Test;

import am.inecobank.base.InecoBaseTest;
import am.inecobank.pages.home.InecobankHomePage;
import am.inecobank.pages.signin.SignInPage;

public class SignInPageTest extends InecoBaseTest {

	@Test

	public void signinFunctionalityTest() {
		InecobankHomePage home = new InecobankHomePage(driver);
		SignInPage signin = home.clickOnSignInbutton();
		signin = signin.fillUsername("John");
		signin = signin.fillPassword("12ert%RR");
		signin = signin.clickLogin();

	}
}
