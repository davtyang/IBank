package am.inecobank.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.inecobank.pages.base.InecobankBasePageObject;
import am.inecobank.pages.signin.SignInPage;

public class InecobankGuestHomePage extends InecobankBasePageObject {
	public InecobankGuestHomePage(WebDriver driver) {
		super(driver);
	}

	public final String SignIn_Btn = "//span[text()[contains(.,'Sign In')]]";
	@FindBy(xpath = SignIn_Btn)
	WebElement signinbutton;

	public SignInPage clickOnSignInbutton() {
		signinbutton.click();
		return new SignInPage(driver);

	}

}
