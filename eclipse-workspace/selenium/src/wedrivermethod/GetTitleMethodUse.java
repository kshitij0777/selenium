package wedrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodUse {

	public static void main(String[] args )
    {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		//driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		String mytitle= driver.getTitle();
		
		System.out.println("my title is"+mytitle);
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		String myurl=driver.getCurrentUrl();
		
		System.out.println("my url is"+myurl);
	

	}

}
