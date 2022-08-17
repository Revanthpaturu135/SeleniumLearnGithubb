package assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertions_Demo {
	WebDriver driver;
	@Test
	public void verifyCurrentURL() {
		driver.get("http://www.techlearn.in/");

		String expURL ="http://www.techlearn.in/";

		System.out.println("Expected Website URL is -"+expURL);
		
		String actURL = driver.getCurrentUrl();
		
		System.out.println("Actual Website URL is -"+actURL);
		
		Assert.assertEquals(actURL, expURL);
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
