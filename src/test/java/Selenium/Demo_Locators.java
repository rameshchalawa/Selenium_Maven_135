package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");

		//id
		//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplaystatus);

		//linktext & partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//className
		//List<WebElement> headerLinks=driver.findElements(By.className("hidden-xs hidden-sm hidden-md"));
		//System.out.println("Total number of header links:"+headerLinks.size());
		
		//tagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
/*
Scenario 1: Locator matching with single web element
findElement(loc) ----> single web element       WebElement
findElements(loc) ----> single web element       List<WebElement>

Scenario 2: Locator is matching with multi web elements
findElement(loc) ---- single web element       WebElement
findElements(loc) ---- multiple web elements     List<WebElement>

Scenario 3: Locator is not matching with any element/s.
findElement(loc) ---- No Such Element Exception
findElements(loc) ---- will not throw any exception. Returns 0
*/
		

	}

}
