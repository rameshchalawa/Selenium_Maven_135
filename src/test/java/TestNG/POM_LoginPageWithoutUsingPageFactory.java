package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without using PageFactory
/*
 Page Object Model (POM) is a design pattern in Selenium that helps to create an object repository for web elements. 
 It is used to separate the test code from the page-specific code, making the test code more readable and maintainable.
 In POM, we create a separate class for each web page in the application 
 and define the locators and action methods for the web elements on that page.
 
 */

public class POM_LoginPageWithoutUsingPageFactory {
	
	WebDriver driver;

    //constructor
	POM_LoginPageWithoutUsingPageFactory(WebDriver driver)
    {
        this.driver=driver;
    }

    //Locators
    By txt_username_loc=By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");

    //Action methods
    public void setUserName(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassword(String pwd)
    {
        driver.findElement(txt_password_loc).sendKeys(pwd);
 
    }

    public void clickLogin()
   {
    driver.findElement(btn_login_loc).click();

   }

}