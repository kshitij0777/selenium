package desiredCapibilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class justDial {

	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	     ChromeOptions opt=new ChromeOptions();
	     //create a object of chromeOptions
	     
	     WebDriver driver=new ChromeDriver(opt);
	     
		
	     
	    //opt.addArguments("--disable-notifications");
	   //opt.addArguments("incognito");
		//opt.addArguments("start-maximized");
	     opt.addArguments("headless");
		driver.get("https://www.justdial.com/");
     }

}
