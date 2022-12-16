package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpStoxApplicationTest {
  @Test
  public void validateUserName()
  {
	  Reporter.log("Validate user name is running", true);
  }
  @BeforeMethod
  public void loginToUpStoxPage()
  {
	  Reporter.log("Enter user neme,Enter password & login to applications", true);
  }
  @AfterMethod
  public void logOutFromUpStoxpage()
  {
	  Reporter.log("Click on log out, loogged out", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser is close ", true);
  }
  @BeforeClass
  public void launghBrowser()
  {
	  Reporter.log("Browser is laungh", true);
  }
}
