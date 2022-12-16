package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		// switching selenium focus from main page to frame
		driver.switchTo().frame("frame1");
		WebElement myelement1 = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
	
		System.out.println(myelement1.getText());
		
		//switching selenium focus from frame to main page
		
		driver.switchTo().defaultContent();
		
		WebElement mainpageelement = driver.findElement(By.xpath("//div[text()='Frames']"));
		
		
		System.out.println(mainpageelement.getText());

		

		
		
		
		

	}

}
