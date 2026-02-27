package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Xpath {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.manage().window().maximize();

		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");

		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");

		//xpath with 'and' operator
		//driver.findElement(By.xpath("//input[@name= 'search' and @placeholder= 'Search']")).sendKeys("Tshirts");
		 
		//xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@name= 'search' or @placeholder= 'xyz']")).sendKeys("Tshirts");
		 
		//xpath with text() - inner text
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		 
		 /*boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		 System.out.println(displaystatus);

		 String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		 System.out.println(value);
		 */
		 
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("Tshirts");

		//xpath with start-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("Tshirts");
		 

	}

}
