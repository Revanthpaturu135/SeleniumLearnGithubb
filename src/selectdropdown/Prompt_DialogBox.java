package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Prompt_DialogBox {
	WebDriver driver;
	@Test
	public  void textEnterandOKButton() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Techlearnin");
		
		Thread.sleep(3000);
		
		alt.accept();
		
		
		
		//driver.switchTo().alert().dismiss();

	}
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 900)"); 
	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
