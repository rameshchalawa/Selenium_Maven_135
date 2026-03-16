package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Bootstrap dropdown is not created using select tag, so we cannot use Select class to handle it. 
 We have to capture the options using findElements() method and Xpath then we can perform operation on it.
 */

public class Demo_BootstrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // opens dropdown option

		//1) Select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();

		//2) capture all the options and find out size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));                                               
		
		System.out.println("Number of options:"+options.size()); //14

		//3) printing options from dropdown
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		//4) select multiple options
		for(WebElement op:options)
		{
		    String option=op.getText();
		    if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
		    {
		        op.click();
		    }
		}

	}

}
