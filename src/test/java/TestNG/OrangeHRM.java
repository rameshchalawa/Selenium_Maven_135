package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 Listener is used to listen the events during test execution and perform some actions based on those events. 
 It is an interface that provides methods to listen to different events during test execution, 
 such as test start, test success, test failure, etc. We can create a class that implements the ITestListener interface 
 and override the methods to perform some actions based on the events. 
 Then we can use Listener class in xml file to listen to the events during test execution and perform some actions based on those events.
 */

//@Listeners(TestNG.MyListener.class)  //@Listeners annotation is not recommended and via xml is recommended
public class OrangeHRM {
	
	WebDriver driver;
	

	@BeforeClass
	void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testLogo() throws InterruptedException {
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority=2)
	void testAppUrl() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3, dependsOnMethods= {"testAppUrl"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}