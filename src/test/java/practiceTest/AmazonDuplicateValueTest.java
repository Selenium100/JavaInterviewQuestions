package practiceTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDuplicateValueTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void amazonTest() {
		driver.get("http://amazon.com");
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		List<String> linksList = linkList.stream().map(e -> e.getText()).collect(Collectors.toList());
		
		Set<String> duplicate = new HashSet<String>();
	Set<String> duplicateNames =	linksList.stream().filter(e -> !duplicate.add(e)).collect(Collectors.toSet());
	System.out.println(duplicateNames);
	
	}

}
