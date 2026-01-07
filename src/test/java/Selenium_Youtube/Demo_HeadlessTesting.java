package Selenium_Youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Advantages
--------
1) we can do multiple tasks( since execution happen backend)
2) faster execution

Disadvantage
-------------
1) user cannot see the actions on the page. so he cannot understand flow/ functionality of the test.
*/

public class Demo_HeadlessTesting {

	public static void main(String[] args) {
		
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new"); //setting for headless mode of execution
		
		    WebDriver driver=new ChromeDriver(options); 
		 
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    String act_title=driver.getTitle();
		    if(act_title.equals("OrangeHRM"))
		    {
		        System.out.println("Test Passed");
		    }
		    else
		    {
		    	System.out.println("Test Failed");
		    	
		    }
		    
		    driver.close();
	}

}
