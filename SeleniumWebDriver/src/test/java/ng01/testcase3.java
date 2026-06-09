package ng01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	WebDriver driver;
	@Test(priority = 1)
	void openFacebook() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	@Test(priority = 2)
	void inputCredentials() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='_R_64qjbjb9pb6amH1_']")).sendKeys("sonalTest@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='_R_66qjbjb9pb6amH1_']")).sendKeys("1234@abc");
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	void loginAndclose() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
