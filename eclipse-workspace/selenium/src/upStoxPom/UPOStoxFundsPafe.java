package upStoxPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UPOStoxFundsPafe 
{
   @FindBy(xpath = "(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]\"" )  private WebElement availableFunds;
   
   
   
   
   public UPOStoxFundsPafe(WebDriver driver)
   {
	 PageFactory.initElements( driver,this);  
   }
   
   public void checkAvailbleFundS()
   {
	 String myFunds = availableFunds.getText();
	 System.out.println("Funds Avale in trades is"+myFunds);
   }
   
}