package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class RightClick {
	WebDriver driver;
	@Test
	public void righclick() {
		driver.get("https:\\www.seleniumlearn.com");
		
		Actions act= new Actions(driver);
		
		act.contextClick(driver.findElement(By.linkText("MYSQL"))).build().perform();
	}
			
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumlearn.com/prompt-dialog-box");
	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
