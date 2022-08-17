package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Time_FormatScreenshot {
	WebDriver driver;
	private Object FileUtils;
	@Test
	public void Screenshot() throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time=dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(f, new File("C:\\Users\\Revanth\\Documents\\Screenshot")); 
		// FileUtils.copyFile(f, new File("E:\\Workspace\\Techlearn"+time+".png")); // for windows matchine path
	}

	@Test // Print Full Screenshot
	public void seleniumlearn() throws Exception {
		driver.get("http://www.seleniumlearn.com");
		Thread.sleep(5000);
		Screenshot();


	}
	@Test
	public void google() throws Exception {
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		Screenshot();
		driver.findElement(By.name("q")).sendKeys("Screeshot using selenium"+Keys.ENTER);
		Screenshot();
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

}
