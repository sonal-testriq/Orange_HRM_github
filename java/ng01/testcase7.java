package ng01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase7 {
	@Test
	void b1() {
		System.out.println("This is b1");
	}
	@AfterTest
	void AT() {
		System.out.println("This is after test method");
	}

}
