package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void assertnull()
  {
	  String a= null;
	  //TC should be passed if a value is null
	  Assert.assertNull(a, "A values is not null , TC is failled");
  }
}
