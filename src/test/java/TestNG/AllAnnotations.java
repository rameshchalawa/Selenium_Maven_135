package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*
 1. @BeforeSuite: execute once before all tests in the suite.
 2. @AfterSuite: execute once after all tests in the suite.
 3. @BeforeTest: execute before any test method belonging to the classes inside the <test> tag is run.(.xml file)
 4. @AfterTest: execute after all the test methods belonging to the classes inside the <test> tag have run.(.xml file)
 5. @BeforeClass: execute once before the first method of the current class is invoked
 6. @AfterClass: execute once after all the methods of the current class have been invoked.
 7. @BeforeMethod: execute before each test method.
 8. @AfterMethod: execute after each test method. 
 */

public class AllAnnotations {
	
	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("Before suite...");
		  
	  }
	
	  @AfterSuite
	  public void afterSuite() 
	  {
		  System.out.println("After suite...");
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("Before test...");
	  }
	
	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("After test...");
	  }
	  
	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("Before class...");
	  }
	
	  @AfterClass
	  public void afterClass() 
	  {
		  System.out.println("After class...");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("Before method...");
	  }
	
	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("After method...");
	  }
	
	  @Test(priority=1)
	  public void tm1() 
	  {
		  System.out.println("Test method 1...");
	  }
	  
	  @Test(priority=2)
	  public void tm2()
	  {
		  System.out.println("Test method 2...");
	  }
	  
}
