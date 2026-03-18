package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 Mouse right click action is used to perform right click on an element. 
 It is used to handle context menu which is visible only after right click.
 Actions class provides the method contextClick() to perform mouse right click action.
 .perform() method is used to complete the action. also it can build and perform the action in one line. 
 .build() method is used to create the action. It is optional.
 */

public class Demo_MouseRightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver=new ChromeDriver();
		    
		    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		    driver.manage().window().maximize();
		    
		    WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		    
		    Actions act=new Actions(driver);
		    
		    //Right click action
		    act.contextClick(button).perform();
		    
		    //click on copy
		    driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		    
		    Thread.sleep(2000);
		    
		    //close alert box
		    driver.switchTo().alert().accept();

	}

}
