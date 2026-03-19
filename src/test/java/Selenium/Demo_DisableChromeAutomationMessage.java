package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//How to disable Chrome is controlled by automated test software message 
/*
 * When you run Selenium tests using ChromeDriver, you may see a message in the browser that
 * If you want to disable this message, you can use the ChromeOptions class in Selenium
 * to set the "excludeSwitches" experimental option to include "enable-automation". This will prevent Chrome from displaying the message when it is being controlled by Selenium.
 */

public class Demo_DisableChromeAutomationMessage {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options); 
		 
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    String act_title=driver.getTitle();
	    if(act_title.equals("OrangeHRM"))
	    {
	        System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    	
	    }
	    
	}

}
