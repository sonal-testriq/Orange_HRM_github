package ng01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testase2 {
WebDriver driver;

@Test (priority = 1)
void method1() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
}
@Test (priority = 2)
void method2() throws InterruptedException {
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(1000);
}
@Test (priority = 3)
void method3() {
	driver.close();
}
}
