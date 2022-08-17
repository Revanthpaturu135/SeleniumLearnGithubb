package log4j;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Lg4j_Demo {

	WebDriver driver;
	@Test
	public void lon4jLaunch() throws Exception {
		Logger log= Logger.getLogger("LogLearning");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		log.info("Launch Chrome Browse");
		
		driver.get("https://www.google.com/");
		
		log.info("Launch Google URL in Browser");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("log4j Tutotial");
		
		log.info("Searching for Log4J Tutorial in Google Search");
		
		log.info("It will wait for 3 seconds");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		log.info("Enter button in press");
		
		log.info("It will wait for 4 seconds");
		
		driver.close();
		log.info("Close the browser");
	}
	@BeforeTest
	public void beforeTest() {
	}
	@AfterTest
	public void afterTest() {
	}

}
