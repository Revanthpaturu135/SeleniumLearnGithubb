package balaBarathi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Balabarath_Registers {
	WebDriver driver;
	@Test
	public void Lanch() throws Exception {
		driver.get("http://baalabharathi.com/upload-story/");
		
		driver.findElement(By.name("text-13263966988")).sendKeys("Revanth");
		
		driver.findElement(By.name("text-241482569216")).sendKeys("kumar");
		
		driver.findElement(By.id("text-23732060291")).sendKeys("revanthpaturu135@gmail.com");
		
		driver.findElement(By.id("field-DVYLZM9QELAAq8K")).sendKeys("9533719163");
		
		driver.findElement(By.id("field-krP8MPeuzRrukdo")).sendKeys("25-001,sanjaya gandhi colony");
		
		driver.findElement(By.id("field-IQsTTT9SxEPs3LH")).sendKeys("samsung");
		
		driver.findElement(By.id("field-2Ngu0gfcgyZYrFE")).sendKeys("chittoor");
		
		driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517214");
		
		driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")).sendKeys("india");
		
		driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("Seleniumlearn.com");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]"))).selectByVisibleText("Ages 1-6 Years Audio Book");
		
		driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("Selenium automates browsers.");
		
		driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("C:\\Users\\Revanth\\Pictures\\Capture.PNG");
		
		driver.findElement(By.name("button-20216154383")).submit();
		
		Thread.sleep(5000);
		
		//driver.close();
        

		
	}
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
