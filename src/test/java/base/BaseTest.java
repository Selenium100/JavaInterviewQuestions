package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BrowserUtil;

public class BaseTest {
	
	public WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void setup(String url, String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			BrowserUtil br = new BrowserUtil();
			driver = br.launchBrowser(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		}if(browser.equalsIgnoreCase("firefox")) {
			BrowserUtil br = new BrowserUtil();
			driver = br.launchBrowser(browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(url);
			
		} 
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
