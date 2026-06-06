package ng01;

import org.testng.annotations.Test;

public class testCase1 {
	

		@Test(priority=1)
		void login()
		{
			System.out.println("login using valid credentials");
		}
		@Test(priority=2)
		void my_profile()
		{
			System.out.println("Redirected to My profile");
		}
		@Test(priority=3) 
		void signup()
		{
			System.out.println("signup for amazon");
		}
	}
	


