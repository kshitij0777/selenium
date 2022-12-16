package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		//driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		WebElement getOTPButton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result1 = getOTPButton.isEnabled();
		
		System.out.println("get otp button result is"+result1);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("7755989895");
		Thread.sleep(2000);
		
		boolean result2 = getOTPButton.isEnabled();
		
		System.out.println("get otp button result is"+result2);
		
		
		
		

	}

}
