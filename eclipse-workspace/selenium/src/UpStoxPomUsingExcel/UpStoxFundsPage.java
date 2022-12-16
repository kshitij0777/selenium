package UpStoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxFundsPage
{
	////variable declaration
	@FindBy(xpath = ("(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]"))private WebElement availableFunds;
	//initialize
	public UpStoxFundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Use
	
	public void checkFunds()
	{
		String myFunds = availableFunds.getText();
		System.out.println("Funds avalble to trade is"+myFunds);
	}

	
	

}
