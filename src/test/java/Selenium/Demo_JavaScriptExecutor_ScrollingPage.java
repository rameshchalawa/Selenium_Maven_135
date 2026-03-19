package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 window.scrollBy(x,y): This method scrolls the page by a specified number of pixels in the horizontal (x) and vertical (y) directions.
 element.scrollIntoView(): This method scrolls the page until the specified element is visible in the viewport. 
 document.body.scrollHeight: This property returns the total height of the document, including the content that is not visible on the screen.
 To scroll to the end of the page, you can use the following JavaScript code:
 window.scrollBy(0, document.body.scrollHeight);
 To scroll back to the top of the page, you can use:
 window.scrollBy(0, -document.body.scrollHeight);
 */

public class Demo_JavaScriptExecutor_ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    //1) scroll down page by pixel number
	    //js.executeScript("window.scrollBy(0,1500)", "");
	    //System.out.println(js.executeScript("return window.pageYOffset;")); //1500
	    
	    //2) scroll the page till element is visible
	    
	    /*WebElement ele=driver.findElement(By.xpath("//h2[text()='Community poll']"));
	    js.executeScript("arguments[0].scrollIntoView();", ele);
	    System.out.println(js.executeScript("return window.pageYOffset;")); //2400*/
	    
	    //3) scroll page till end of the page.
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset;")); //2441
	    
	    Thread.sleep(2000);
	    
	    //4) Scrolling up to initial position
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset;")); //0

	}

}
