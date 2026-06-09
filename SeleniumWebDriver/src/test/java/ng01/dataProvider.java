package ng01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	WebDriver driver;
	@BeforeClass 
	void preset() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test (dataProvider = "dataprovinputs")
	void loginCredentials(String email, String pswd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pswd);
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
	
	@DataProvider(name="dataprovinputs", indices = {0, 2})
	Object login_inputs()
	{
		Object datainput[][] = {
				{"notcorrectmail@fake.com", "qwerty987"},
				{"incorrectemail@demo.com", "asdf852"},
				{"sonalmewada@gmail.com", "Saarth@2023"},
				{"invalidusername@test.com", "789plmqaz"}
		};
		return datainput;
	}
	}

/* @BeforeClass
 * @Test1(DataProvider = DP1) : Signup Combinations
 * @Test2(DataProvider = DP2): Login Combinations
 * @AfterClass
 * 
 * @DataProvider1(name= "DP1")
 * @DataProvider2(name = "DP2")
 */
