package Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In Selenium, you can capture screenshots using the TakesScreenshot interface.
 * The getScreenshotAs method is used to capture the screenshot and save it as a file.
 * You can capture the entire page or a specific section of the page by using the appropriate WebElement.
 * To save the screenshot, you can specify the target file path and use the renameTo method to copy the source file to the target location.
 * Make sure to handle any exceptions that may occur during the screenshot capture process, such as IOException.
 * It's also important to ensure that the target directory exists before saving the screenshot, and to manage file naming conventions to avoid overwriting existing files.
 */

public class Demo_TakesScreenShot1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
		//getScreenshotAs method calling from TakesScreenshot interface to capture the screenshot of full page
		File sourcefile1=ts.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile1.renameTo(targetfile1); // copy source file to target file
		*/

		//2) capture the screenshot of specific section
		Thread.sleep(2000);
		WebElement featuredProducts=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
        
		//getScreenshotAs method calling from WebElemet interface to capture the screenshot of specific section
		File sourcefile2=featuredProducts.getScreenshotAs(OutputType.FILE); 
		File targetfile2=new File(System.getProperty("user.dir")+"\\screenshots\\featredproducts.png");
		sourcefile2.renameTo(targetfile2); // copy source file to target file

		driver.close();

	}

}
