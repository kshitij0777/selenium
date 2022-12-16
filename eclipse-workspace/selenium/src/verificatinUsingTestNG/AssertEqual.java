package verificatinUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void TestCsae1()
  {
	  String a="A.nagar";
	  String b="A.nagar";
	  // I need to verify a & b are equal or not?
	  // If a & b is equal TC is pass or TC is failed
	  
	  if(a.equals(b))
	  {
		  Reporter.log("a & b are matching, TC is passed", true);
	  }
	  else
	  {
		  Reporter.log("a & b are not matching, TC is failed", true);
	  }
	  // Using Hard Assert using static method of Assert class
	  // 01----> AssertEqual()
	  
	  Assert.assertEquals(a, b,"A & B are not matching TC is failed ");
   }
}
