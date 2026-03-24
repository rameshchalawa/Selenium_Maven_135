package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/*
1. Extent report is a third party library used to generate the test execution report in a visually appealing format. 
It provides various features like charts, graphs, and screenshots to make the report more informative and easy to understand.
2. To use extent report in your test automation framework, you need to add the extent report dependency in your project.
3. You can create a listener class that implements the ITestListener interface and override the methods to generate the extent report based on the test execution events.
4. In the onStart method, you can initialize the extent report and specify the location of the report.
5. In the onTestSuccess, onTestFailure, and onTestSkipped methods, you can create a new test entry in the report 
and update the status of the test method based on the test execution result.
6. Finally, you can use the flush method to write the report to the specified location after the test execution is completed.

ExtentSparkReporter: It is used to create the UI of the report and specify the location of the report.
ExtentReports: It is used to populate the common information on the report, such as system info, test details, etc.
ExtentTest: It is used to create test case entries in the report and update the status of the test methods.
*/

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");//specify location of the report
		sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
		sparkReporter.config().setReportName("Regression Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK); // theme of the report (DARK, STANDARD)
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter); // attach the UI to the extent report
		
		extent.setSystemInfo("Computer Name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Ramesh");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","Chrome");
	}
    
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName()); // create a new entry in the report
	    test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
	}

	public void onTestFailure(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
	    test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
	}
	
	public void onFinish(ITestContext context) {
	    extent.flush(); // write the report to the specified location
	}
	
	
}