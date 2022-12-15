package maven07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage
{

	WebDriver driver;
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closeButton;
	@FindBy(id = "lbl_username") private WebElement userName;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logoutButton;
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void popUpHandle(WebDriver driver)
	{
		if(okButton.isDisplayed())
		{
			Utility.wait(driver, 1000);
			okButton.click();
			Utility.scrollIntoView(driver, closeButton);
			Utility.wait(driver, 1000);
			closeButton.click();
			Reporter.log("Handeling popup..",true);
		}
		else
		{
			Utility.wait(driver, 1000);
			Reporter.log("There are no Popup", true);
		}

		
	}
	public String getUserName(WebDriver driver)
	{
	String actualUserName = userName.getText();
	Reporter.log("getting user Name",true);
	return actualUserName;
	}
	
	public String getBalance(WebDriver driver)
	{
		Utility.wait(driver,1000);
		String actualBalance = balance.getText();
		Reporter.log("getting act balance", true);
		return actualBalance;
		
	}
	public void logOutFromNeoStox(WebDriver driver)
	{
		Utility.wait(driver,1000);
		userName.click();
		Utility.wait(driver, 1000);
		logoutButton.click();
		Reporter.log("Logging out from NeoStox", true);
		
	}

}
