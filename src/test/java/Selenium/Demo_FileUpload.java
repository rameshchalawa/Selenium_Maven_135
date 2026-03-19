package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_FileUpload {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    driver.manage().window().maximize();
	    
	    //Single file upload
	    /*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\Test1.txt");
	    
	    if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt"))
	    {
	    	System.out.println("Test1.txt file is uploaded successfully");
	    }
	    else {
	    	System.out.println("Test1.txt file is not uploaded");
	    }*/
	    
	    //Multiple file upload
	    String file1="C:\\Automation\\Test1.txt";
	    String file2="C:\\Automation\\Test2.txt";
	    
	    //"\n" is used to separate multiple file paths in the sendKeys method.
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2); 
	    
	    //validation noOfFilesUploaded
	    int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	    if(noOfFilesUploaded==2)
	    {
	    	System.out.println("All files are uploaded successfully");
	    }
	    else {
	    	System.out.println("All files are not uploaded");
	    }
	    
	    //validation file names
	    if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt") 
	    		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt"))
	    {
	    	System.out.println("File names are correct");
	    }
	    else {
	    	System.out.println("File names are not correct");
	    }

	}

}
