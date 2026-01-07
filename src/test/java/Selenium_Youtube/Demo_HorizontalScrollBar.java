package Selenium_Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_HorizontalScrollBar {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://speedwaytech.co.in/testing-02/slider/");
		
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//input[@id='top01']"));
		System.out.println("Default Location of the min slider :"+min_slider.getLocation()); //(359, 232)= (x,y)
		act.dragAndDropBy(min_slider, 100, 232).perform();
		System.out.println("Location of the min slider after moving:"+min_slider.getLocation());
		
		

	}

}
