package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	    
	    
	    
	    
	    
	    

	}

}
