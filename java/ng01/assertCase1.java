package ng01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertCase1 {
@Test
void test() {
	//Assert.assertNotEquals("Saaj", "Sonal");
	Assert.assertFalse(1 == 2);
}
@Test
//void hardassertions() {
//	System.out.println("Today is Monday");
//	System.out.println("Today is Tuesday");
//	Assert.assertEquals("Java", "java");
//	System.out.println("Today is wednesday");
//	System.out.println("Today is thursday");
//}
void softAssertions() {
	System.out.println("Today is Monday");
	System.out.println("Today is Tuesday");
	SoftAssert SA = new SoftAssert();
	SA.assertEquals("Java", "java");
	System.out.println("Today is wednesday");
	System.out.println("Today is thursday");
    SA.assertAll();
}
}
