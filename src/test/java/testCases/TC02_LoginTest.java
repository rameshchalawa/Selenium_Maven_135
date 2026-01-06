package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void verify_login()
	{
		logger.info("** Startign TC02_LoginTest **");
		try
		{
			//HomePage
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			//Login
			LoginPage lp=new LoginPage(driver);
			//lp.setEmail(p.getProperty("email"));
			lp.setEmail("chalwaindia@gmail.com");
			//lp.setPassword(p.getProperty("password"));
			lp.setPassword("Password1234");
			lp.clickLogin();
            
			//MyAccount
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**  TC02_LoginTest Execution Completed **");
	}


}
