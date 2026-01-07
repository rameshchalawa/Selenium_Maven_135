package Selenium_Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_MouseDragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
		driver.manage().window().maximize();

		//drag and drop1
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));

		//drag and drop2
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(rome, italy).perform();

		act.dragAndDrop(washington, us).perform();

	}

}
