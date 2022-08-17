package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert_OkButton {
	WebDriver driver;
	@Test
	public  void alertOK() {

		driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
		
		driver.switchTo().alert().accept();


	}
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
