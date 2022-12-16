package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.BaseNew;
import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.NeoStoxPasswordPage;
import neoStoxPOM.NeoStoxSignLogin;
import neoStoxUtility.UtiltyNew;

public class ValidateNeoStoxUserNameUsingPropertyFile extends BaseNew
{
  NeoStoxSignLogin login;
  NeoStoxPasswordPage password;
  NeoStoxHomePage home;
  
  
  @BeforeClass
  public void launchNeoStox() throws IOException
  {
	 launchBrowser();
	 login=new NeoStoxSignLogin(driver);
	 password=new NeoStoxPasswordPage(driver);
	 home=new NeoStoxHomePage(driver); 
  }
  
  @BeforeMethod
  public void loginToNeoStox() throws IOException, InterruptedException
  {
	  login.sendMobileNum(driver,UtiltyNew.readDataFromPropertyFile("mobNum"));
	  login.clickOnSignInButton(driver);
	  Thread.sleep(2000);
	  password.sendPassword(driver, UtiltyNew.readDataFromPropertyFile("pass"));
	  password.clickOnSubmitButton(driver);
	  Thread.sleep(2000);
	  home.popUpHandle(driver);
	    
  }
  @Test
  public void validateUserName() throws IOException
  {
	  Assert.assertEquals(home.getUserName(driver), UtiltyNew.readDataFromPropertyFile("userName"));
	  UtiltyNew.takeSceenshot(driver, home.getUserName(driver));
  }
  
  @Test
	public void validateAcBalance()
	{
	   Assert.assertNotNull(home.getBalance(driver));
	   Reporter.log("AC balance is "+home.getBalance(driver), true);
	}
  
  @AfterMethod
  public void logOut()
  {
	  home.logOutFromNeoStox(driver);
  }
  
  @AfterClass
  public void closeApplication() throws InterruptedException 
  {
	closingBrowser(driver);
  }
  
}
