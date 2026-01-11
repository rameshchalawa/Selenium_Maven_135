package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_HandleDatePicker {
	
	//selecting future date
	static void selectFutureDate(WebDriver driver,String year,String month,String date)
	{
	   while(true)
	   {
	   String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//a
	   String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//act
	   
	   if(currentMonth.equals(month) && currentYear.equals(year))
	       {
	          break;
	        }
	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
	               //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
	   }
	   
	   List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	   
	   for(WebElement dt:allDates)
	   {
	      if(dt.getText().equals(date))
	      {
	        dt.click();
	        break;
	      }
	  }
	   
	   
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		                 
		driver.switchTo().frame(0);
        
		//using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		String year= "2026";
		String month= "January";
		String date= "2";
		
		selectFutureDate(driver,year,month,date);
		

	}

}