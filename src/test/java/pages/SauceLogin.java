//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class SauceLogin {
//	WebDriver driver;
//	
//	By username = By.id("user-name");
//	By password = By.id("password");
//	By login = By.id("login-button");
//	
//	
//	public void enterUserName(String strUsername) {
//		driver.findElement(username).sendKeys(strUsername);
//	}
//	
//	public void enterPassword(String strPassword) {
//		driver.findElement(password).sendKeys(strPassword);
//	}
//	
//	public void clickLogin() {
//		driver.findElement(login).click();
//	}
//	
//	public void loginToSauceDemo(String strUsername, String strPassword) {
//		this.enterUserName(strUsername);
//		this.enterPassword(strPassword);
//		this.clickLogin();
//		
//	}
//}
