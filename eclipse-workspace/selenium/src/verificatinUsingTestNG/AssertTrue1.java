package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue1 {
  @Test
  public void assertTrue()
  {
	  boolean a= true;
	  // If a is true TC should be Passed
	  Assert.assertTrue(a," TC is Failed , a is false ");
	  
}
}
