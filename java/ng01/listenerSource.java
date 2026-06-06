package ng01;

import java.security.PublicKey;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerSource implements ITestListener {
	public void onStart(ITestContext context) {
		System.out.println("The programm initiated");
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started...");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");		
	}
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution completed");		
	}
}
