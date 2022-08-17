package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Descritpion {
	WebDriver driver;
	
	@Test(priority=3,description="seleniumDev", enabled=false)
	public void testCase_1() throws Exception {

		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(5000);
	}
	@Test(description="google",priority=2,enabled=true)
	public void testCase_2() {

		driver.get("https://www.google.co.in/?hl=te");
		
		driver.findElement(By.name("q")).sendKeys("TestNG");
	
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	@Test(description="facebook",enabled=true,priority=1)
	public void testcase_3() {

		driver.get("https:www.facebook.com");
	}
	@Test(priority=4,enabled=false,description="flipkart")
	public void testcase_4() {

		driver.get("https://www.flipkart.com/");
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
