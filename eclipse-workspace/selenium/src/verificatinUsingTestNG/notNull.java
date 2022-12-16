package verificatinUsingTestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class notNull {
  @Test
  public void assertNotNull() 
  {
	  //TC should be passed if a value is not null
	  String a="xyz";
	  Assert.notNull(a,"A value is null ,TC is failed");
  }
}
