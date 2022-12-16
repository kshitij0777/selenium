package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void assertFalse() 
  {
	  boolean a= false;
	  //TC should be passed if a is false
	  Assert.assertFalse(a,"A tc is failed");
  }
}
