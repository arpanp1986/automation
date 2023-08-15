package browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserSetup {
	public static WebDriver getDriver(String browserName) {
        WebDriver driver = null;
        
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser name. Supported browsers: Chrome, Firefox only. Setting up Chrome as adefault browser");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        
        return driver;
    }
}
