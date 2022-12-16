package UpStoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPassCodePage 
{ 
	//variable declaration
	@FindBy(id  ="yob")private WebElement passcode1;
	
	//initialize variable
	
	public UpStoxPassCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//usage(variable methods----->Actions)
	public void enterPasscode(String pass)
	{
		passcode1.sendKeys(pass);
	}

}
