package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void assertNotEqual() 
  {
	  // My TC is should be passed when two things are not equal
	  
	  String a="Pune";
	  String b="Mumbai";
	  Assert.assertNotEquals(a, b,"A & B are equal TC is failed");
	  Reporter.log("TC is passed A and B are not matching", true);
	  
  }
}
