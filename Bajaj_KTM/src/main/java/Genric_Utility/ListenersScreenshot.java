package Genric_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersScreenshot extends BaseclassScreeshot implements ITestListener {

	ExtentTest test;
	ExtentReports extent = Extentreport.getReport();

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName() + " -Testcase Passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
		String FilePath = null;

		try {
			FilePath = screenshoots(result.getMethod().getMethodName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(FilePath, result.getMethod().getMethodName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
