package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG_crossBrowser {

public	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) throws Exception {

		try {

			if(browser.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

				Thread.sleep(2000);
				driver = new ChromeDriver();

				driver.manage().window().maximize();
			}

			else if(browser.equalsIgnoreCase("FF")) {

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revanth\\Documents\\chromedriver_win32\\chromedriver.exe");

				driver = new FirefoxDriver();

				driver.manage().window().maximize();
			}


			/*else if (Browser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Revanth\\Documents//msedgedriver.exe");
				driver = new EdgeDriver();

				driver.manage().window().maximize();
			}*/

		}

		catch(WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

		@Test 
		public void Run() throws Exception {
			driver.get("http://www.google.com");
			//Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys("cross browser testing in TestNG"+Keys.ENTER);
			//Thread.sleep(5000);
		}
	}

 