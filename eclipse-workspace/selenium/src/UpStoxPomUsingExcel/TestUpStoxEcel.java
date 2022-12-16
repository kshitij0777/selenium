package UpStoxPomUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import upStoxPom.UpStoxPasscodePage;

public class TestUpStoxEcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login-v2.upstox.com/");
	     Thread.sleep(1000);
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     //Reading data from excel
	     File MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
	     Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet7");
	     
	     //Create a object of login page
	     UpStoxLoginPage login= new UpStoxLoginPage(driver);
	     login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
	    String pwd1 = mySheet.getRow(0).getCell(1).getStringCellValue();
	    login.SemdPassword(pwd1);
	    login.clickOnSighInButton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    
	    
	  //create an object of passcode page
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    UpStoxPassCodePage passcode= new UpStoxPassCodePage(driver);
	    passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    
	    
	  //create an object of Welcome page
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    UpStoxWelcomePage welcome= new UpStoxWelcomePage(driver);
	    welcome.clicknoIamGoodButton();
	    
	  //create an object of Home page
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    UpStoxHomePage home= new UpStoxHomePage(driver);
	  home.valiDateUserId(driver);
	  home.clickOnFundButton(driver);
	  
	  //create an object of funds page
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	  UpStoxFundsPage funds=new UpStoxFundsPage(driver);
	  funds.checkFunds();
	  home.logOutFromApllication();
	  driver.close();
	 
	 
	}

}
