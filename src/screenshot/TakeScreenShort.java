package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class TakeScreenShort {
	WebDriver driver;
	@Test
	public void Screenshort() throws Exception {
		driver.get("http://seleniumlearn.com/");

		WebElement screen =driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		File Source= screen.getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
		FileHandler.copy(Source,new File("C:\\Screenshot\\Seleniumsearch.png"));
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
}

