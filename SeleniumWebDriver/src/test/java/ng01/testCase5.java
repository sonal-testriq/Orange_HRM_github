package ng01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase5 {
/* 
 1. login @BeforeMethod
 2. transfer to p1 @Test
 3. logout @AfterMethod
 4. login @BeforeMethod
 5. transfer to p2 @Test
 6. logout
 
 
 */
    @BeforeMethod
	void login() {
    	System.out.println("User has logged in");
		
	}
    @Test (priority = 1)
	void transferP1() {
    	System.out.println("Money transfer to P1");
		
	}
    
    @Test (priority = 2)
    void transferP2() {
    	System.out.println("Money transfer to P2");
	
    }
	@AfterMethod
	void logout() {
		System.out.println("User has been logged out");
		
	}
	
}
