package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDown_values {
	WebDriver driver;
	@Test
	public void dropdownselect() {
		
		//new Select(driver.findElement(By.xpath("//*[@id=\"transactionType\"]"))).selectByVisibleText("QA");
            
		//new Select(driver.findElement(By.id("transactionType"))).selectByValue("4");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"transactionType\"]"))).selectByIndex(3);
	}
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://seleniumlearn.com/program-drop-down-select-option");

	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
