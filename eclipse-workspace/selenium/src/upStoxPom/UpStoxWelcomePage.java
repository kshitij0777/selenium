package upStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage 
{
	//variable declaration
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noIAmGoodButton;
	
	//variable iniliaztion
	
	public UpStoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnnoIAmGoodButton()
	{
		noIAmGoodButton.click();
	}
	
	

}
