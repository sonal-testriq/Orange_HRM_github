package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;



	// constructor
	public class testProject01{
		
		WebDriver driver;
		public testProject01(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//input[@placeholder='Username']" )
		WebElement username_textElement;

		@FindBy(xpath = "//input[@placeholder='Password']")
		WebElement password_textElement;@FindBy(xpath = "//button[@type='submit']")
		WebElement login_button;

		// Execution/Action methods 
		public void fillUN(String username) {
			username_textElement.sendKeys(username);
		}

		public void fillPW(String pwd) {
			password_textElement.sendKeys(pwd);
		}

		public void ClickLoginBtn() {
			login_button.click();
		}

	}
	
	// Locators
//	By username_locator =  By.xpath("//input[@placeholder='Username']");
//	By password_locator = By.xpath("//input[@placeholder='Password']");
//	By loginbutton_locator = By.xpath("//button[@type='submit']");
//	
//	
//   // Execution/Action methods 
//	public void fillUN(String username) {
//		driver.findElement(username_locator).sendKeys(username);
//	}
//	
//	public void fillPW(String pwd) {
//		driver.findElement(password_locator).sendKeys(pwd);
//	}
//	
//	public void ClickLoginBtn() {
//		driver.findElement(loginbutton_locator).click();
//	}
//	
//}
