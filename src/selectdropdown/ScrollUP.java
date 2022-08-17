package selectdropdown;

import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScrollUP {
	WebDriver driver;
	@Test
	public void scrollup() {
		driver.get("http://seleniumlearn.com/");
		JavascriptExecutor Obj= (JavascriptExecutor)driver;
		Obj.executeScript("scroll(9000,0)");

	}
	@Test
	public void scrolldown() throws Exception {
		driver.get("http://seleniumlearn.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 900)"); 
		Thread.sleep(5000);        

	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

}
