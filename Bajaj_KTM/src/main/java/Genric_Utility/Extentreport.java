package Genric_Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {

	public static ExtentReports  getReport()
	{
		String path = System.getProperty("user.dir")+"\\Report\\Report.index.html";
		ExtentSparkReporter reporter =  new ExtentSparkReporter(path);
		reporter.config().setReportName("Bajaj KTM project reports");
		reporter.config().setDocumentTitle("My document");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Team Leader", "Lavanya.P");
		extent.setSystemInfo("Tester Name", "Madhu.Sonnad");
		return extent;
	}
}
