package ng01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.This;

public class testcase6 {
	@Test
	void a1() {
		System.out.println("This is a1");
	}
	@BeforeTest
	void BT() {
        System.out.println("This is before test method.");
	}
	

}
