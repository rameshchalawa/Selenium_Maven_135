package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*All methods from ITestListener interface here https://javadoc.io/static/org.testng/testng/7.9.0/org/testng/ITestListener.html
OnStart and onFinish methods are executed only once for the entire test execution, while other methods are executed for each test method.
OnTestStart, onTestSuccess, onTestFailure, and onTestSkipped methods are executed for each test method in the test class. 
So if you have 5 test methods, these methods will be executed 5 times each, once for each test method.
 */

public class MyListener implements ITestListener {
	
	public void onStart(ITestContext context) {
	    System.out.println("Test execution is started.......");
	}

	public void onTestStart(ITestResult result) {
	    System.out.println("test started...");
	}

	public void onTestSuccess(ITestResult result) {
	    System.out.println("test passed...");
	}

	public void onTestFailure(ITestResult result) {
	    System.out.println("test failed...");
	}

	public void onTestSkipped(ITestResult result) {
	    System.out.println("test skipped...");
	}

	public void onFinish(ITestContext context) {
	    System.out.println("test execution is completed...");
	}

}