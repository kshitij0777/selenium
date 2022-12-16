package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
		  
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demoqa.com/alerts");

		 driver.manage().window().maximize();
		 
		driver.findElement(By.id("alertButton")).click();//after clicking on this button we will get alert
		

		//1.	To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		Alert alt = driver.switchTo().alert();

//		Alert alt = driver.switchTo().alert();
	
	//	System.out.println("alert  text is------>"+alt.getText());
		//2.	Alert is an interface which contains abstract methods like:
				//	1. accept(): use to click on ok button.
				//	2. dismiss(): use to click on cancel button.
				//	3. getText(): use to get text present in a alert popup.
	//to  click ok button of alert  use accept method
		
		alt.accept();
		
		Thread.sleep(1000);
		
		String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		
		System.out.println(myText);
     }

}
