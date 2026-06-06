package ng01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testMethod1 {
	WebDriver driver;
	@BeforeClass
	void preset()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void testlogin()
	{
		testProject2 tp1 = new testProject2(driver);
		tp1.fillUN("Admin");
		tp1.fillPW("admin123");
		tp1.ClickLoginBtn();
	}
	
	@AfterClass
	void testclose() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(2000);
	}
	
}


