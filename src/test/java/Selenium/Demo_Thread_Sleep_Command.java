package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Thread.sleep() is Java command which is used to pause the execution for a specific time to solve the synchronization issue.
Advantages : Easy to use
Disadvantages :
1. If the time is not sufficient then you will get exception
2. It will wait for maximum time out. This will reduce the performance script.
3. Need to use multiple times.
 */

public class Demo_Thread_Sleep_Command {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
       Thread.sleep(3000); //pause the execution
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}
