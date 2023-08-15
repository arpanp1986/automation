package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogin {
	WebDriver driver;
	
	@FindBy(name="user-name")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logoName;
	
	public SauceLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
	
	public void enterPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void sauceLogin(String strUsername1, String strPassword1) {
		enterUserName(strUsername1);
		enterPassword(strPassword1);
		clickLogin();
	}
	
	public String getbrandLogo() {
		return logoName.getText();
	}
}
