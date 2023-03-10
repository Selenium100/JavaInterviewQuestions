package practiceTest;

import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {
	
	@Test
	public void titleTest() {
		String title =  driver.getTitle();
		System.out.println(title);
	}
	


}
