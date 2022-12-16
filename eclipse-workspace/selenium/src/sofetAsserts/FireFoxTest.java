package sofetAsserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void fireFox() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe" );
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.phonepe.com/");
  }
}
