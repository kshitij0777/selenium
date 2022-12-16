package UpStoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import screenshoat1.Scrolling;

public class UpStoxHomePage 
{
	//variable declaration
		@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userId; 
		@FindBy(id = "funds" ) private WebElement fundsButton;
		@FindBy(xpath = "//div[text()='Logout']")private WebElement logOutButton;
		
		public UpStoxHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void valiDateUserId(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(1000);
			Scrolling.scrollIntoView(driver, userId);
			String actualUserID = userId.getText();
			String expectedUserID = "kshitij j.";
			
			
			
			if(actualUserID.equalsIgnoreCase(expectedUserID))
			{
				System.out.println("actual and accepted  user id are matching TC is paas");
			}
			else
			{
				System.out.println("actual and accepted  user id are not matching TC is fail");
			}
		}
			public void clickOnFundButton (WebDriver driver) throws InterruptedException
			{
				Thread.sleep(1000);
				fundsButton.click();
				Scrolling.scrollIntoView(driver, userId);
				Thread.sleep(1000);
			}
			
			public void logOutFromApllication() throws InterruptedException
			{
				userId.click();
				Thread.sleep(1000);
				logOutButton.click();
			}

			
			}
			


