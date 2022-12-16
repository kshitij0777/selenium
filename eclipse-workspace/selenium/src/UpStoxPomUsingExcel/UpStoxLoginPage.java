package UpStoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage 
{
	//variable declaration
	@FindBy(name = "userId") private WebElement userId;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath  ="//div[text()='Sign into Upstox'] ") private WebElement signInbutton;
	
	//initialize using constructor-->uses-->pageFactory class-->(method)-->initElements
	public UpStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//variable Usage using method
	
	public void sendUserName(String un)
	{
		userId.sendKeys(un);
	}
	public void SemdPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnSighInButton()
	{
		signInbutton.click();
	}
	
	

}
