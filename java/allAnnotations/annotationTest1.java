package allAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationTest1 {
@AfterSuite	
void AS() {
	System.out.println("This is a After suite");
}
@BeforeSuite
void BS() {
	System.out.println("This is a Before suite ");
}
@AfterTest
void AT() {
	System.out.println("This is a After test");
}
@BeforeTest
void Bt() {
	System.out.println("This is a Before Test");
}
@BeforeClass
void BC() {
	System.out.println("This is before class");
}
@AfterClass
void AC() {
	System.out.println("This is after class");
}
@BeforeMethod
void BM() {
	System.out.println("This is a before method");
}
@AfterMethod
void AM() {
	System.out.println("This is a after method");
}
@Test (priority = 1)
void test1() {
	System.out.println("This is a method test1");
}
@Test (priority = 2)
void test2(){
	System.out.println("This is a method test2");
}
}
