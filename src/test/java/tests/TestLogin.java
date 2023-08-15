package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import PageFactory.SauceLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	WebDriver driver;

	@BeforeTest
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void test_login_page() throws InterruptedException {
		SauceLogin sauceLogin = new SauceLogin(driver);
		sauceLogin.sauceLogin("standard_user", "secret_sauce");
		System.out.println(sauceLogin.getbrandLogo());
		Assert.assertTrue(sauceLogin.getbrandLogo().toString().contains("Swag Labs"));
	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		driver.quit();
	}
	
}
