package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
	    super(driver); // calling the constructor of the parent class (BasePage) to initialize the driver variable in the BasePage class
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")  // Login link added in step5
	WebElement linkLogin;

	
	public void clickMyAccount()
	{
	    lnkMyaccount.click();
	}

	public void clickRegister()
	{
	    lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}


}
