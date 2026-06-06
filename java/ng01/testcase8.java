package ng01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testcase8 {
//	@Test
//	void sm() {
//       System.out.println("This is from suite");
//	}
//	@AfterSuite
//	void AS() {
//		System.out.println("This is a after suite method");
//	}
//	@BeforeSuite
//	void BS() {
//		System.out.println("This is a before suite method");
//	}
	WebDriver driver;
	@Test (priority = 1)
	void getTitle()
	
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		String Actual_title = driver.getTitle();
		String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    	System.out.println( "Page title is " + Actual_title);
		if(expected_title.equals(Actual_title))
		{
			System.out.println("Test Passed ");
		    Assert.assertTrue(true);	
		}
		else 
	{
		System.out.println("Test Failed");	
		Assert.assertTrue(false);
		 
	}
	
//	
// Assert.assertEquals(expected_title, Actual_title);

}
	@Test (priority = 2)
	void driverClose() {
		driver.close();
	}
}