package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_TimeOut {
	WebDriver driver;
	
	@Test
	public void withOutTimeOut() throws Exception {

		driver.get("https:www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("www.techlearn.in");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
	@Test(timeOut=3000)
	public void withTimeOut() {

		driver.get("https:www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("www.facebook.com");
	
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
	
	@Test(priority=0,description="twitter")
	public void testcase_5() {

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
