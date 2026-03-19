package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * When we try to access a website with an invalid SSL certificate, the browser displays a warning message and blocks access to the site. 
 * To handle SSL certificate errors in Selenium, we can use the ChromeOptions class to set the acceptInsecureCerts capability to true. 
 * This will allow Selenium to bypass the SSL certificate error and access the website.
 */

public class Demo_HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true); // accepts SSL(Secure Socket Layer) certificates

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println("title of the page:"+driver.getTitle()); //Privacy error

	}

}
