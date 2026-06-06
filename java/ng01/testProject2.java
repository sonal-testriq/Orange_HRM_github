package ng01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class testProject2 {
WebDriver driver;
public testProject2(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//input[@placeholder='Username']" )
WebElement username_textElement;

@FindBy(xpath = "//input[@placeholder='Password']")
WebElement password_textElement;

@FindBy(xpath = "//button[@type='submit']")
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
