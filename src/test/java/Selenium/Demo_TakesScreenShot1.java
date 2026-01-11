package Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_TakesScreenShot1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile1=ts.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile1.renameTo(targetfile1); // copy source file to target file
		*/

		//2) capture the screenshot of specific section
		Thread.sleep(2000);
		WebElement featuredProducts=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));

		File sourcefile2=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\screenshots\\featredproducts.png");
		sourcefile2.renameTo(targetfile2); // copy source file to target file

		driver.close();

	}

}
