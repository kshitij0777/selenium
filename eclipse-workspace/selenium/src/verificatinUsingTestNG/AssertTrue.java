package verificatinUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void verifyCheckBox() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe" );
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	  
//	 if(checkBox1.isSelected())
//	 {
//		 Reporter.log(" check box is selected tc is Pass", true);
//	 }
//	 else
//	 {
//		 Reporter.log(" check box is not selected tc is fail", true);
//	 }
	  checkBox1.click();
	  Assert.assertTrue(checkBox1.isSelected(), "check box is not selected tc is fail");
	  
	  
	  
  }
}
