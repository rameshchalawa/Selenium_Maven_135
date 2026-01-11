package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

        //get(url) - opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //getTitle() - returns title of the page
        System.out.println(driver.getTitle()); //OrangeHRM

        //getCurrentUrl() - returns URL of the page
        System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/in

        //getPageSource() - returns source code of the page
        //System.out.println(driver.getPageSource());

        //getWindowHandle() - returns ID of the single Browser window
        //String windowid=driver.getWindowHandle();
        //System.out.println("Window ID:"+ windowid); //6111C2C07E3890B27341CA75BEC7E0D4 
        
        //getWindowHandles() - returns ID's of the multiple browser windows
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will opens new browser window
        Set<String> windowids=driver.getWindowHandles();
        System.out.println(windowids); //[72E3A093AF57FC69915C7EA5CD5099AD, 334D2B34148960535F430DF951797BA3]
        
        
        
    }
}