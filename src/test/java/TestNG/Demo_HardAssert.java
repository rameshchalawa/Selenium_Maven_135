package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_HardAssert {
	
	  @Test
	  public void test() 	  
	  {
		    //Assert.assertEquals("abc",123); //failed
		    //Assert.assertEquals(123,123);   //passed
		    
		    //Assert.assertNotEquals(123,123); // failed
		    //Assert.assertNotEquals(123,345); //passed
		    
		    //Assert.assertTrue(true); //pass
		    //Assert.assertTrue(false); //failed
		    
		    //Assert.assertTrue(1==2); //fail
		    //Assert.assertTrue(1==1); //passed
		    
		    //Assert.assertFalse(1==2); //passed
		    //Assert.assertFalse(1==1); //failed
		    
		    Assert.fail(); //it will fail the test case
	  }
}
