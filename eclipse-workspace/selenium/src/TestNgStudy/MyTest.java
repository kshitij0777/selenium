package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test         
  public void A() 
  {
	  System.out.println("A method is Running");
	  Reporter.log("A method is running use--->log");
	  Reporter.log("A method is running use--->log true", true);
	  
  }
  @Test
  public void B()
  {
	 System.out.println("B method is running");
	 Reporter.log("B method is running use------>log");
	 Reporter.log("B method is running use------>log true", true);
  }
}
