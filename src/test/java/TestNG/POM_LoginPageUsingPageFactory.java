package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using PageFactory is recommended approach
/*
 PageFactory is a class in Selenium that provides support for the Page Object Model (POM) design pattern.
 It is used to initialize the elements of a page class and to create an object repository for the web elements on the page.
 The PageFactory class provides a convenient way to initialize the web elements of a page class using annotations such as @FindBy, @FindBys, and @FindAll.
 The @FindBy annotation is used to locate a web element using a specific locator strategy, such as id, name, xpath, cssSelector, etc.
 The PageFactory class also provides a method called initElements() that is used to initialize the web elements of a page class.
 */

public class POM_LoginPageUsingPageFactory {
	
	WebDriver driver;

    //constructor
	POM_LoginPageUsingPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this); // MANDATORY to initialize the elements of the page class, 
        //this will create the connection between the driver and the locators defined in the page class. 
        //It will also initialize the WebElement variables with the corresponding elements on the web page.
    }

    //Locators
	
	//@FindBy(how=How.XPATH, using="//input[@placeholder='Username']") Alternative way to find locator
    
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement txt_username;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement txt_password;

    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement btn_login;
    
    //Action methods
    public void setUserName(String user)
    {
    	txt_username.sendKeys(user);
    }

    public void setPassword(String pwd)
    {
    	txt_password.sendKeys(pwd);
    }

    public void clickLogin()
    {
    	btn_login.click();
    }

}