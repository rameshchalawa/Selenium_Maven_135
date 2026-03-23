package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
dependsOnMethods: if any test method is dependent on another test method and if the test method on which it is dependent is
failed then it will skip the execution of dependent test method and mark it as skipped in the report.
 */
public class dependsOnMethods {
	
	  @Test(priority=1)
	   void openapp() 
	  {
		  Assert.assertTrue(true);
	  }
	  
	  @Test(priority=2, dependsOnMethods="openapp")
	   void login() 
	  {
		  Assert.assertTrue(false);
	  }
	  
	  @Test(priority=3, dependsOnMethods="login")
	   void search() 
	  {
		  Assert.assertTrue(true);
	  }
	  
	  @Test(priority=4, dependsOnMethods="search")
	   void logout() 
	  {
		  Assert.assertTrue(true);
	  }
	  
}
