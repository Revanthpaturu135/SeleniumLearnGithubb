package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHover {
	WebDriver driver;
	@Test
	public  void mouseover() throws Exception {
		
		driver.get("http://seleniumlearn.com/");
		
		
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.linkText("Selenium Training"))).click().perform();		
	

	}
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
