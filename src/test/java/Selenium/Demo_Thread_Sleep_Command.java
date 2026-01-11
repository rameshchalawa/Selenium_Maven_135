package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Thread_Sleep_Command {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
       Thread.sleep(3000); //pause the execution
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}
