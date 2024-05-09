package Genric_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseclassScreeshot
{
	public static String screenshoots(String testcaseName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) Baseclass.driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "//Reports" + testcaseName +".png");
		FileUtils.copyFile(src, des);
		return System.getProperty("user.dir") + "//Reports" + testcaseName +".png";
	}
}