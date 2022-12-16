package UpStoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage 
{
	//variable declaration
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement noIamGood;
	
		//initialize variable
    public UpStoxWelcomePage(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    }
    //Use
    public void clicknoIamGoodButton() throws InterruptedException
    {
    	noIamGood.click();
    	Thread.sleep(8000);
    }
    
	

}
