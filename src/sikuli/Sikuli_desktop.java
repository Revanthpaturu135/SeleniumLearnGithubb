package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuli_desktop {
	Screen s = new Screen();
	WebDriver driver;
  @Test
  public void sikulidestopautomation() throws FindFailed, Exception {
	  //s.click("C:\\Users\\Revanth\\Documents\\Sikuli\\Revanth.PNG");
	 // s.click("C:\\Users\\Revanth\\Documents\\Sikuli\\Sikuli.PNG");
	 // s.type("C:\\Users\\Revanth\\\\Documents\\Sikuli\\Search.PNG","Notepad");
	  
	  Thread.sleep(5000);
	  s.dragDrop(" C:\\Users\\Revanth\\Documents\\Sikuli\\B.PNG", "C:\\Users\\Revanth\\Documents\\Sikuli\\A.PNG");
  }
  @BeforeTest
  public void beforeTest() {
	    
  }

}
