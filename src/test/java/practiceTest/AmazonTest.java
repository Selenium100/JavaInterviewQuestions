package practiceTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class AmazonTest extends BaseTest {
	
	
	
	
	@Test()
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	

}
