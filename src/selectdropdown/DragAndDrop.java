package selectdropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragAndDrop {
	WebDriver driver;
	@Test
	public  void draganddrop() {
		
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		
		Actions act= new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).build().perform();
		

	}
	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		Thread.sleep(2000);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		
		//driver.close();
	}

}
