package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Zooming in and out of a web page can be achieved using JavaScriptExecutor in Selenium. 
 * The JavaScript code to zoom in or out of a page is as follows:
 * document.body.style.zoom='80%'; // Zoom in to 80%
 * document.body.style.zoom='120%'; // Zoom out to 120%
 * You can adjust the percentage value to achieve the desired zoom level.
 */

public class Demo_ZoomInZoomOut {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    //Zoom in the page by 80%
	    js.executeScript("document.body.style.zoom='80%'");
		

	}

}
