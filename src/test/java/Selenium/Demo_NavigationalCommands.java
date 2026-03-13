package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Navigational Commands are used to navigate between the web pages. It is available in the WebDriver.Navigation interface.
 driver.get() - it accepts URL only in the string format.
 driver.navigate().to() - it accepts URL in the String format and (URL Object) format.
 */

public class Demo_NavigationalCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		//driver.get("https://demo.nopcommerce.com/"); // accepts URL only in the string format

		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl); //accept URL in the String format and (URL Object) format.

		driver.navigate().to("https://demo.nopcommerce.com/");                          
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

	}

}
