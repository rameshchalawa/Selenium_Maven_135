package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_HandleDatePicker2 {
	
	static void selectDate(WebDriver driver,String requiredYear,String requiredMonth,String requiredDate)
	{
		//select year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear);
		
		//select month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByVisibleText(requiredMonth);
		
		//select date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates)
		   {
		      if(dt.getText().equals(requiredDate))
		      {
		        dt.click();
		        break;
		      }
		  }
		
		
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");                                         
		driver.manage().window().maximize();

		//input DOB
		String requiredYear = "2026";
		String requiredMonth = "Jun";
		String requiredDate = "16";

		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		selectDate(driver, requiredYear, requiredMonth, requiredDate); //calling userdefined method to select date
	
	}

}
