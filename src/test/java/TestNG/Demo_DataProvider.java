package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

/*
 Data provider is used to run the same test method with different sets of data. It is a method that returns an array of objects and is annotated with @DataProvider.
 step 1) create a method and annotate it with @DataProvider and return type should be Object[][]
 step 2) pass the name of data provider method in test method using dataProvider attribute of @Test annotation
 step 3) run the test case and it will execute for all sets of data provided by
 		 data provider method.
 		 
 */
public class Demo_DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);                                            
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed(); //div[@id="content"]/h2[1]
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,3})
	Object[][] loginData()
	{
		Object data[][]= {
		                    {"abc@gmail.com", "test123"},
		                    {"xyz@gmail.com", "test012"},
		                    {"john@gmail.com", "test@123"},
		                    {"pavano123@gmail.com", "test@123"},
		                    {"johncanedy@gmail.com", "test"},
		                 };
		
		return data;
		
	}

	
}
