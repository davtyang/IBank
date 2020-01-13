package am.inecobank.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class InecoBaseTest {
	protected WebDriver driver;

	@BeforeTest
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.inecobank.am");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void cleanup() {
		driver.quit();
	}

}
