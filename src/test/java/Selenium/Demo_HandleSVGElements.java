package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 SVG: Scalable Vector Graphics (SVG) is an XML-based vector image format
      for two-dimensional graphics with support for interactivity and animation.
standard xpath will not work for svg elements because svg elements are in different namespace, so we need to use name() function in xpath to handle svg elements.
//*[name()='tagname']  --> to handle svg elements, we need to use name() function in xpath and tag name should be in small letters.
 */

public class Demo_HandleSVGElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		//identify svg element
		WebElement svgElement = driver.findElement(By.xpath("//*[name()='path' and @id='path-2']")); 
		
		svgElement.click();
		
		
		
	}

}
