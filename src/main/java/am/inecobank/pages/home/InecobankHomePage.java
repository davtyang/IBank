package am.inecobank.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.inecobank.pages.base.InecobankBasePageObject;
import am.inecobank.pages.signin.SignInPage;

public class InecobankHomePage extends InecobankBasePageObject {
	public InecobankHomePage(WebDriver driver) {
		super(driver);
	}

	public final String DROP_DOWN_LNG = "//button[@class='languageDropDown__btn languageDropDown__btn--icon']";
	@FindBy(xpath = DROP_DOWN_LNG)
	WebElement dropdownbutton;
	
	public final String CHANGE_LNG_EN = "//a[@data-value=\"en\"]";
	@FindBy(xpath = CHANGE_LNG_EN)
	WebElement engbutton;

	public final String SignIn_Btn = "//span[text()[contains(.,'Sign In')]]";
	@FindBy(xpath = SignIn_Btn)
	WebElement signinbutton;
	
	public SignInPage clickOnSignInbutton() {
		dropdownbutton.click();
		engbutton.click();
		signinbutton.click();
		return new SignInPage(driver);
	
		}

	}
	
		
		
		
	
