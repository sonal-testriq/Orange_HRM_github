package ng01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTest {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void preset(String br) {
		switch(br) {
		case "chrome": driver = new ChromeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		case "edge" : driver = new EdgeDriver();
		break;
		default: System.out.println("Invalid browser");
		return;
		}
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@Test 
	void loginCredentials() throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("sonalmewada@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Saarth@2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		
	boolean	status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	if (status == true)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();
	}
	
	}
	@AfterClass
	void program_end()
	{
		driver.close();
	}
}
/* 1. Create basic test script with main @Test method.
 * 2. Create automatic xml file of the test script 
 * 3. Passing parameters with different browsers.(chrome, edge, firefox).
 * 4. Sequential execution on every browser.	
 * 5. Parallel execution on all browser(Thread-count only at the suite level not for test level).
 * 
 */
