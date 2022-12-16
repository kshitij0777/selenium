package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.NeoStoxPasswordPage;
import neoStoxPOM.NeoStoxSignLogin;
import neoStoxUtility.Utility;

public class ValidateNeoStoxBalance extends Base {
	NeoStoxSignLogin login;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	@BeforeClass
	public void launchNeoStox()
	{		
        launchBrowser();
	    login= new NeoStoxSignLogin(driver);
	    password= new NeoStoxPasswordPage(driver);
	    home= new NeoStoxHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
	   login.sendMobileNum(driver, Utility.readDataFromExcel(4, 0));
	   login.clickOnSignInButton(driver);
	   Thread.sleep(1000);
	   password.sendPassword(driver, Utility.readDataFromExcel(4, 1));
	   password.clickOnSubmitButton(driver);
	   Thread.sleep(1000);
	   home.popUpHandle(driver);
	}
	
	@Test
	public void validateAcBalance()
	{
	   Assert.assertNotNull(home.getBalance(driver));
	   Reporter.log("AC balance is "+home.getBalance(driver), true);
	}
	
	@AfterMethod
	public void logout()
	{
	   home.logOutFromNeoStox(driver);
	}
	
	@AfterClass
	public void closeApplication() throws InterruptedException
	{
	   closingBrowser(driver);
	}
}
