package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssert {
	
	
  //@Test
  void test_hardassertions()
	{
		System.out.println("testign......");
		System.out.println("testign......");
		Assert.assertEquals(1, 2); //hard assertion Here, when assert is failed remaining statement will not get execute
		System.out.println("testing....");
		System.out.println("testing....");
	}

	@Test
	void test_softassertion()
	{
		System.out.println("testign......");
		System.out.println("testign......");
		
		SoftAssert sa=new SoftAssert(); //To access soft assert we need to create object of SoftAssert class
		
		sa.assertEquals(1, 2); //soft assertion here remaining statements still get execute even assert is failed
		System.out.println("testing....");
		System.out.println("testing....");
		
		sa.assertAll();
	}
}
