package ng01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase4 {
	WebDriver driver;
	@Test (priority = 1)
	void openAmazon() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
	}
	@Test (priority = 2)
	void inputCredentials() throws InterruptedException {
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(1000);
	}
	@Test (priority = 3)
	void loginAndClose() {
		driver.close();
		
	}

}
