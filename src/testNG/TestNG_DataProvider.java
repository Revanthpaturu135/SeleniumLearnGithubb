package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DataProvider {

	WebDriver driver;
	public String str;

	@DataProvider (name="datainput")
	public String [][] login() {
		return new String[][] {
			{"9533719163","Revanth@135"},
			{"Prabhu","9533719163"},
			{"selenium","9490830690"}
		};

	}
	@Test (dataProvider="datainput")
	public void login(String user, String pass) throws Exception {
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		try{
			driver.findElement(By.linkText("//span[normalize-space()='Log Out']")).click();	
					str="Pass";
			System.out.println("str");
		}
		catch(Exception e){
			str="Fail";
			System.out.println("str");
		}  
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

		//driver.close();	
	}

}
