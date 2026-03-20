package TestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/*
1. TestNG execute test methods based on alphabetical order.
2. @Test(priority=num) controls the order of execution.
3. Once you provide priority to the test methods, then order of methods is not considered.
4. priorities can be random numbers( no need to have consecutive numbers).
5. If you dont provide priority then default value is Zero (0).
6. If the priorities are same then again execute methods in alphabetical order.
7. Negative values are allowed in priority.
8. TestNG execute test methods only if they are having @Test annotation.
 */

public class OrangeHRMTest {
	
	WebDriver driver;

	@Test(priority=1, groups= {"regression"})
	void openapp()
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority=2, groups= {"regression"})	
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed... "+status);
	}

	@Test(priority=3, groups= {"regression"})	
	void testLogin()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority=4, groups= {"regression"})	
	void CloseApp()
	{
		driver.close();
	}
	
	
}
