package sofetAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrowBack {
  @Test
  public void testing()
  {
	  String a="ABC";
	  String b="ABC";
	  String c="ABC1";
	 
	  Assert.assertEquals(a, b," A and B are not Equal TC is FAiled");
	  Assert.assertEquals(a, c," A and c are not Equal TC is FAiled");
	  Assert.assertNull(b,"B is not null Tc is failed");
  }
}
