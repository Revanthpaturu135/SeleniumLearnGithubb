package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GetText_Method {
	WebDriver driver;
	@Test
	public  void getText() {

		String Obj =   driver.findElement(By.id("reg_pages_msg")).getText();

		System.out.println(Obj);



	}
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https:\\www.facebook.com");
	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
