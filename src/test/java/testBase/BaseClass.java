package testBase;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager; //Log4j
import org.apache.logging.log4j.Logger;    //Log4j

/*
 This BaseClass will be the parent class for all the test classes in the project. 
 It will contain the common code for all the test classes such as setup and teardown methods, 
 and also some utility methods for generating random data and capturing screenshots. 
 achieving code reusability and maintainability by centralizing the common code in a single class.
 */

public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;

	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException
	{
		//Loading config.properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
	    p=new Properties();
		p.load(file);
		
	    logger=LogManager.getLogger(this.getClass()); //LOG402
	    
	    switch(br.toLowerCase())
	    {
	        case "chrome" : driver=new ChromeDriver(); break;
	        case "edge" : driver=new EdgeDriver(); break;
	        default : System.out.println("Invalid browser name.."); return; 
	        //return statement is used to exit the method if the browser name is invalid, so that the rest of the code in the method will not be executed.
	    }
	    
	    driver.manage().deleteAllCookies(); // to delete all the cookies before starting the test execution
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(p.getProperty("appURL"));  //Reading url from config.properties file.
	    driver.manage().window().maximize();
	}

	@AfterClass(groups= {"Sanity","Regression","Master"})
	public void tearDown()
	{
	    driver.quit();
	}
	
	public String randomString()
	{
	    String generatedstring=RandomStringUtils.randomAlphabetic(5);
	    return generatedstring;
	}

	public String randomNumber()
	{
	    String generatednumber=RandomStringUtils.randomNumeric(10);
	    return generatednumber;
	}

	public String randomAlphaNumeric()
	{
	    String generatedstring=RandomStringUtils.randomAlphabetic(3);
	    String generatednumber=RandomStringUtils.randomNumeric(3);
	    return (generatedstring+"@"+generatednumber); // to generate random alphanumeric string in the format
	}
	
	public String captureScreen(String tname) throws IOException {
	    String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    
	    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    
	    String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + "timeStamp" + ".png";
	    File targetFile = new File(targetFilePath);
	    
	    sourceFile.renameTo(targetFile);
	    
	    return targetFilePath;
	}


}
