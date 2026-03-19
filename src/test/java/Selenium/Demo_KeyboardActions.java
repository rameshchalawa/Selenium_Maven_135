package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Keyboard actions are used to simulate keyboard interactions with web elements.
 * The Actions class in Selenium provides methods to perform various keyboard actions such as keyDown, keyUp, sendKeys, etc.
 * Common keyboard actions include:
 * - Ctrl+A: Select all text
 * - Ctrl+C: Copy the selected text
 * - Ctrl+V: Paste the copied text
 * - Ctrl+X: Cut the selected text
 * - Tab: Move to the next element
 * - Shift+Tab: Move to the previous element
 * - Ctrl+Shift+A: Select all text in uppercase
 */

public class Demo_KeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get("https://text-compare.com/");        
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		
		Actions act=new Actions(driver);
		
		//Ctrl+A (Select all text)
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+C (Copy the selected text)
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//Tab (Move to the next textarea)
		//act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl+V (Paste the copied text)
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+Shift+A (Select all text in uppercase)
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	}

}
