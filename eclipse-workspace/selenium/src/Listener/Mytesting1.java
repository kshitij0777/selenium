package Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytesting1 
{
	 @Test
	  public void A() 
	  {
		  Reporter.log("Tc A is running", true);
	  }
	  @Test(dependsOnMethods = "C")
	  public void B() 
	  {
		  Reporter.log("Tc b is running", true);
	  }
	  @Test
	  public void C() 
	  {
		  Assert.fail();
		  Reporter.log("Tc c is running", true);
	  }
}
