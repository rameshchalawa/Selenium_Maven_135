package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 Mouse hover action is used to perform mouse hover on an element. 
 It is used to handle hidden elements which are visible only after mouse hover.
 Actions class provides the method moveToElement() to perform mouse hover action.
 .perform() method is used to complete the action. also it can build and perform the action in one line. 
 .build() method is used to create the action. It is optional.
 */

public class Demo_MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		Actions act=new Actions(driver);

		//Mouse hover
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();

		act.moveToElement(desktops).moveToElement(mac).click().perform();

	}

}
