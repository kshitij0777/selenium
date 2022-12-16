package upStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login-v2.upstox.com/");
	     Thread.sleep(1000);
	     
	     
	   //create an object of UpstoxLoginPage
	     UpStoxLoginPage login=new UpStoxLoginPage(driver);
	     login.enterUserID();
	     login.enterPassword();
	     login.clickOnSignInButton();
	     
	     //create an object UpstoxPassCodePage
	     Thread.sleep(3000);
	     UpStoxPasscodePage passcode=new UpStoxPasscodePage(driver);
	     passcode.enterPassCode();
	     
	   //create an object of UpstoxWelcomePage
	     Thread.sleep(7000);
	     UpStoxWelcomePage welcome=new UpStoxWelcomePage(driver);
	     welcome.clickOnnoIAmGoodButton();
	     
	   //create an object of UpstoxHomePage
	     Thread.sleep(5000);
	     UpStoxHomePage home=new UpStoxHomePage(driver);
	     home.valiDateUserId(driver);
	     home.clickOnFundButton(driver);
	     
	   //create an object of UpStoxFundsPage
	     Thread.sleep(5000);
	     UPOStoxFundsPafe fund=new UPOStoxFundsPafe(driver);
	     fund.checkAvailbleFundS();
	     home.logOutFromApllication();
	     
	     
	     
	     
	     driver.close();
	     



	}

}
