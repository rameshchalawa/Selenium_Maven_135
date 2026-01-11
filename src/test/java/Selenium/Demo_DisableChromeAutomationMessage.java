package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//How to disable Chrome is controlled by automated test software message 

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
