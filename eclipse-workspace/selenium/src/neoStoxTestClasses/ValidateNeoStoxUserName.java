package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

public class ValidateNeoStoxUserName extends Base
{
	NeoStoxSignLogin login;
	NeoStoxPasswordPage password;
	NeoStoxHomePage home;
	
	@BeforeClass
	public void launchNeoStox() 
	{
		launchBrowser();
		login=new NeoStoxSignLogin(driver);
		password= new NeoStoxPasswordPage(driver);
		home=new NeoStoxHomePage(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendMobileNum(driver, Utility.readDataFromExcel(4, 0));
		login.clickOnSignInButton(driver);
		Utility.wait(driver,2000);
		password.sendPassword(driver, Utility.readDataFromExcel(4, 1));
		password.clickOnSubmitButton(driver);
		Utility.wait(driver,2000);
		home.popUpHandle(driver);
		
	}
	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getUserName(driver), Utility.readDataFromExcel(4, 2));
		Utility.takeSceenshot(driver, home.getUserName(driver));
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