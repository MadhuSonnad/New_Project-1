package Mainclass;

import java.util.concurrent.TimeUnit;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v122.debugger.Debugger.SetInstrumentationBreakpointInstrumentation;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Genric_Utility.Baseclass;
import Genric_Utility.Excel_utility;
import Genric_Utility.File_Utility;
import Genric_Utility.RandomNum;
import Genric_Utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KTM {

	WebDriver driver;
	public JavascriptExecutor js;
	@BeforeMethod
	private void launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu.sonnad\\eclipse-workspace\\Bajaj_KTM\\Browser\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//ChromeOptions options=new ChromeOptions();
		//options.setBinary("C:\\Users\\madhu.sonnad\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		//WebDriver driver=new ChromeDriver(options);
		driver.get("http://106.51.64.224:7007/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nithin.mathew@sysfore.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[.='Login your account']")).click();
	}

	@Test
	public void Loginpage() throws Throwable 
	{

		js=(JavascriptExecutor)driver;
		/*File_Utility flib=new File_Utility();
		Excel_utility elib=new Excel_utility();
		RandomNum jlib=new RandomNum();
		Webdriver_Utility wlib=new Webdriver_Utility();*/

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Object_Repo.Loginpage login=new Object_Repo.Loginpage(driver);	

		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("(//span[@class='cursor-pointer'])[10]"));
		//js.executeScript("window.scrollBY (0,200)");
		Thread.sleep(2000);
		//element.click();
		js.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("(//span[.='Notify'])[10]"));
		js.executeScript("arguments[0].scrollIntoView(true)", element2);
		Thread.sleep(2000);
		element2.click();
		//js.executeScript("arguments[0].click()", element2);


		WebElement ele = driver.findElement(By.xpath("(//div[.=' Banner file notified successfully. '])[2]"));
		ele.getText();
		if (ele.isDisplayed()) 
		{
			System.out.println("Toster mess is displayed");
		} else 
		{
			System.out.println("Toster mess is Not displayed");
		}
	}
}
