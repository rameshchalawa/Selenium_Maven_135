package Selenium_Youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("//www.opencart.com/");

        //Selenium4.x
        //driver.switchTo().newWindow(WindowType.TAB); //opens new tab
        driver.switchTo().newWindow(WindowType.WINDOW); //open new window

        driver.get("https://orangehrm.com/");

	}

}
