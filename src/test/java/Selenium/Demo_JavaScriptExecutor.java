package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
JavaScriptExecutor is an interface in Selenium that allows you to execute JavaScript code within the context of the browser. 
It provides a way to interact with web elements and perform actions that may not be possible using standard Selenium methods.
Common use cases for JavaScriptExecutor include:
- Scrolling: You can scroll the page to a specific element or to a certain position using JavaScript.
To use JavaScriptExecutor, you need to cast your WebDriver instance to the JavaScriptExecutor interface.
executeScript() method is used to execute JavaScript statements.
To handle ElementInterceptedException, we can use JavaScriptExecutor to click on the element instead of using the standard click() method.
 */

public class Demo_JavaScriptExecutor {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();

		 WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		 
		 // passing the text into inputbox - alternate of sendKeys()
		 JavascriptExecutor js=(JavascriptExecutor)driver; //upcasting WebDriver to JavaScriptExecutor
		 js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox); 
		 //arguments[0] refers to the first argument passed after the script, which is inputbox in this case.

		 // clicking on element - alternate of click()
		 WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		 js.executeScript("arguments[0].click()",radiobtn);

	}

}
