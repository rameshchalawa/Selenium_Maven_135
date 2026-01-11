package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		//isDisplayed() method
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:"+logo.isDisplayed()); //true

		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status:"+ status);
		
		//isEnabled() method
		boolean status1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status: "+status1); //true
		
		//isSelected() Method
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println("Before selection.............");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false

		System.out.println("After selecting male...");
		male_rd.click(); // select male radio button

		System.out.println(male_rd.isSelected()); // true
		System.out.println(female_rd.isSelected()); //false
		
		boolean newsletterstatus=driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']")).isSelected();
		System.out.println("News letter checkboks status:"+newsletterstatus ); //true

	}

}
