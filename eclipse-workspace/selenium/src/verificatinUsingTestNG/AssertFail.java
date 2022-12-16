package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void assertFail()
  {
	  Assert.fail();
  }
}
