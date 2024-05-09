package Genric_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Object_Repo.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	SoftAssert assrt = new SoftAssert();
	public static WebDriver driver;
	public WebDriver sdriver;

	@Parameters("BROWSER")
	@BeforeClass
	public void baseclass() throws Throwable {
		File_Utility file1 = new File_Utility();
		Webdriver_Utility web = new Webdriver_Utility();
		String Browser = file1.getpropertyvalue("browser");

		if (Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\madhu.sonnad\\eclipse-workspace\\Bajaj_KTM\\Browser\\chromedriver.exe");
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		sdriver = driver;
		System.out.println("Launching browser");
	}

	@BeforeClass(dependsOnMethods = "baseclass()")
	public void baseMethod() throws Throwable {
		File_Utility file1 = new File_Utility();
		String URL = file1.getpropertyvalue("url");
		String UserName = file1.getpropertyvalue("un");
		String PassWord = file1.getpropertyvalue("pw");

		driver.get(URL);

		Loginpage page = new Loginpage(driver);
		page.login(UserName, PassWord);
		System.out.println("Login application");
	}

	@AfterClass
	public void afterMethod() {
		System.out.println("Logout application");
	}

	@AfterClass(dependsOnMethods = "afterMethod()")
	public void afterClass() {
		System.out.println("close the browser");
		assrt.assertAll();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("executed sucessfully");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("database close");
	}

//	public static String SS(String testcaseName) throws IOException {
//
//		TakesScreenshot tk = (TakesScreenshot)driver;
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		File des = new File(System.getProperty("user.dir") + "//Reports" + testcaseName +".png");
//		FileUtils.copyFile(src, des);
//		return System.getProperty("user.dir") + "//Reports" + testcaseName +".png";
//	}

}