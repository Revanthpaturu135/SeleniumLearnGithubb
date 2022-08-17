package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Enabled_false_True {
	WebDriver driver;
	
	@Test(priority=3,enabled=false)
	public void selenium() throws Exception {

		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(5000);
	}
	@Test(priority=2,enabled=true)
	public void google() {

		driver.get("https://www.google.co.in/?hl=te");
	}
	@Test(enabled=false)
	public void facebook() {

		driver.get("https:www.facebook.com");
	}
	@Test(priority=1,enabled=true)
	public void flipkart() {

		driver.get("https://www.flipkart.com/");
	}
	@Test(priority=0,enabled=true)
	public void twitter() {

		driver.get("https:twitter.com");
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

		//driver.close();
	}

}
