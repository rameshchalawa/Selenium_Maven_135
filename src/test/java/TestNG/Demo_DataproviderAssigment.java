package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DataproviderAssigment {
	
	WebDriver driver;

	@DataProvider(name="LoginData1")
	public Object[][] getdata()
	{
		return new Object[][] {
		{"chalwaindia@gmail.com", "Password1234"},
		{"abc@gmail.com", "Password123"},
		                   
		  };
				
	}
	
	@Test(dataProvider="LoginData1")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);                                            
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		boolean status=driver.findElement(By.xpath("//div[@id='content']/h2[1]")).isDisplayed(); 
		if(status==true)
		{
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.close();
	}
	
}
