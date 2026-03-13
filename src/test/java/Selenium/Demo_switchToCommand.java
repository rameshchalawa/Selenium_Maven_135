package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
SwitchTo command is used to switch the control from one window to another window, frame or alert.
getWindowHandle() - returns ID of the single Browser window
getWindowHandles() - returns ID's of the multiple browser windows 
 */

public class Demo_switchToCommand {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");                                                               
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Appoach1
		/*List<String> windowList=new ArrayList(windowIDs);
		
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to Parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());*/
		
		//Approach2
		for(String winId:windowIDs)
		{
			String title=driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
				//some validation on the parent window
			}
		}

	}

}
