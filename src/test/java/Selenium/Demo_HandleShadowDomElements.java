package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Xpath can not handle shadow dom elements.
//Only CSS can handle shadow dom elements.
/*
 Shadow DOM: It is a web standard that allows developers to encapsulate their HTML, CSS, and JavaScript code within a component. 
 It creates a separate DOM tree for the component, which is hidden from the main document's DOM tree. 
 This allows developers to create reusable components without worrying about conflicts with other parts of the page.
 Shadow DOM is commonly used in web development to create custom elements and web components.
 Shadow DOM elements are not accessible using traditional DOM traversal methods, such as getElementById or querySelector.
 To access shadow DOM elements, you need to use the ShadowRoot interface, which provides methods for traversing the shadow DOM tree and accessing its elements.
 */

public class Demo_HandleShadowDomElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/"); //This website is developed using shadow dom elements, sendkeys method will not work directly on shadow dom elements, it will throw NoSuchElementException Error.
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME"); //NoSuchElementException

	    //Handle shadow dom element
		//SearchContext is an interface which is implemented by WebDriver and ShadowRoot. It is used to search for elements in the DOM tree.
	    SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	    Thread.sleep(1000);
	    shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");

	}

}
