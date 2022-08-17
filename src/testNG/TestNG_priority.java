package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_priority {
	WebDriver driver;
	@Test(groups="Regression")
	public void selenium() {

		driver.get("https://www.selenium.dev/");
		
	}
	@Test(groups="Regression")
	public void google() {

		driver.get("https://www.google.co.in/?hl=te");
	}
	@Test(groups="sanity")
	public void facebook() throws Exception {

		driver.get("https:www.facebook.com");
		
		Thread.sleep(5000);}
	@Test(groups="sanity")
	public void flipkart() {

		driver.get("https://www.flipkart.com/");
	}
	@Test(groups="Regression")
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
