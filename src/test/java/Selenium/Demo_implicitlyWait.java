package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
Implicit Wait is a global wait which is applicable for all the web elements in the script.
Adv:
1) Single time/one statement
2) It will not wait till maximum time if the element is available
3) Applicable for all the elements
4) Easy to use
Disadvantage:
if the time is not sufficient then you will get exception. NoSuchElementException
 */

public class Demo_implicitlyWait {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    
	    driver.close();
	    

	}

}
