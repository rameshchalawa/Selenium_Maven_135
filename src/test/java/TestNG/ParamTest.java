package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 parallel testing using xml file
step 1) created test case
step 2) created xml file then run test case through xml
step 3) passed browser name as parameter from xml file to setup() method
step 4) execute test case on chrome & Edge (serial execution) //by making multiple <test> tags in xml file and passing different browser name as parameter value in each <test> tag, we can run the test cases on different browsers one by one (serial execution)
step 5) execute test case on chrome & edge ( parallel execution) //parallel="tests" in xml file will make the test cases run in parallel.
 */

public class ParamTest {
	
	WebDriver driver;

	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String url) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
			case "chrome": driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver();break;
			default: System.out.println("Invalid browser");return; // return to exit from method if invalid browser is passed
		}
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority=2)
	void testTitle()
	{
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority=3)
	void testURL()
	{
	    Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void tearDown()
	{
	    driver.quit();
	}
	
	
	
}
