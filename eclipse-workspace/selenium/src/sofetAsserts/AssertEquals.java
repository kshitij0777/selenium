package sofetAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void testing()
  {
	  String a="abc";
	  String b="abc";
	  String c="xyz";
	 
	  Assert.assertEquals(a, b," A and B are not Equal TC is FAiled");
	  Assert.assertEquals(a, c," A and c are not Equal TC is FAiled");
	  soft.assertAll();
	
  }
  @Test
  public void  testing1()
  {
	  boolean a= false;
	  soft.assertTrue(a, "A is false TC is failed");
	  Assert.assertNotNull(a,"A is null TC is failled");
	  soft.assertAll();
	  
  }
}
