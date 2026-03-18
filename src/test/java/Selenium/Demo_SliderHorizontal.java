package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_SliderHorizontal {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");        
        driver.manage().window().maximize();
        
        Actions act=new Actions(driver);
        //min slider
        //WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));        
        //System.out.println("default Location of the min slider:"+min_slider.getLocation()); //(59, 250) (X,Y)
        
        //dragAndDropBy method is used to move the slider by specific x and y coordinates.
        //act.dragAndDropBy(min_slider, 100, 246).perform(); 
        //System.out.println("Location of the min slider after moving:"+min_slider.getLocation()); //(158, 250) (X,Y)
        
        //max slider
        WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        System.out.println("default Location of the max slider:"+max_slider.getLocation()); //(613, 246) (X,Y)
        act.dragAndDropBy(max_slider, -100, 246).perform();
        System.out.println("Location of the max slider after moving:"+max_slider.getLocation()); //(513, 246) (X,Y)
        
	}

}
