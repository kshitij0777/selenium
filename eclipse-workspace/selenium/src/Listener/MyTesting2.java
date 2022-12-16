package Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTesting2 {
	 @Test
	  public void D() 
	  {
		  Reporter.log("Tc D is running", true);
	  }
	  @Test(dependsOnMethods = "F")
	  public void E() 
	  {
		  Reporter.log("Tc E is running", true);
	  }
	  @Test
	  public void F() 
	  {
		  Assert.fail();
		  Reporter.log("Tc F is running", true);
	  }
}
