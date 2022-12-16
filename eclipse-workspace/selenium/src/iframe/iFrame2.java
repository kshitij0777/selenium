package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement MainPageElement = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		Thread.sleep(1000);
		System.out.println(MainPageElement.getText());
		
		
	//	driver.switchTo().frame("frame1");//switching focus from main page to parent frame
		Thread.sleep(1000);
		String parentText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("parent text is"+parentText);
		Thread.sleep(2000);
		//driver.switchTo().frame(9);//switching from parent frame to child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		Thread.sleep(2000);
		String childText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
				System.out.println("Child text is "+childText);
				driver.switchTo().defaultContent();//switching from child to main page
				System.out.println(MainPageElement.getText());

	}

}
