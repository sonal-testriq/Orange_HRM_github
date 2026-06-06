package ng01;

import java.time.Duration;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ng01.listenerSource.class)
public class listeners {
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {
		driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test (priority = 1)
	void validateLogo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status , true);
		Thread.sleep(1000);
	}
	@Test (priority = 2)
	void validateUrl() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi");
		Thread.sleep(1000);
	}
	@Test (priority = 3, dependsOnMethods = {"validateUrl"})
	void validatePagetitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@AfterClass
	void setupEnd() {
		driver.quit();
	}

}
