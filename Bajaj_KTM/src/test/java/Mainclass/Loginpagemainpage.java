package Mainclass;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genric_Utility.Baseclass;
import Genric_Utility.Excel_utility;
import Genric_Utility.File_Utility;
import Genric_Utility.RandomNum;
import Genric_Utility.Webdriver_Utility;
import Object_Repo.Add_customer_Voice;
import Object_Repo.Add_customer_lvl;
import Object_Repo.Bannerupload;
import Object_Repo.Product_Improvement;
import Object_Repo.Spare_part_catalogue;
import net.bytebuddy.description.annotation.AnnotationList.Empty;

public class Loginpagemainpage extends Baseclass {
	File_Utility flib = new File_Utility();
	Excel_utility elib = new Excel_utility();
	RandomNum rlib = new RandomNum();
	Webdriver_Utility wlib = new Webdriver_Utility();
	JavascriptExecutor js;


	/*	@Test(priority = 2, enabled = true)
	public void Loginpage() throws Throwable 
	{
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//Object_Repo.Loginpage login = new Object_Repo.Loginpage(driver);
		Thread.sleep(2000);
		WebElement element = driver.findElement(
				By.xpath("(//span[@class=\"cursor-pointer\"]//following::*[@class=\"ktm-file-actions\"])[8]"));
		js.executeScript("arguments[0].click()", element);
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("(//span[.='Notify'])[10]"));
		js.executeScript("arguments[0].click()", element2);
		WebElement ele = driver.findElement(By.xpath("(//div[.=' Banner file notified successfully. '])[2]"));
		Thread.sleep(1000);
		ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Toster mess is displayed");
		} else {
			System.out.println("Toster mess is Not displayed");
		}
		Thread.sleep(2000);
		//assertEquals(false, "Script make fail");
	}

	@Test(priority = 1) // (enabled = false)
	private void Bannerup() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Bannerupload upload = new Bannerupload(driver);
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		js.executeScript("arguments[0].click()", element3);
		Thread.sleep(2000);
		upload.bannerUpload();
		String Excel = elib.getdatafromExcel("Sheet1", 0, 0) + rlib.randomnum();
		upload.passvlu(Excel);
		String Excel1 = elib.getdatafromExcel("Sheet1", 0, 1) + rlib.randomnum();
		upload.passingdata(Excel1);
		Thread.sleep(2000);
	}

	@Test (priority = 3) //(enabled = false)
	private void addCustomrVoicee() throws Throwable {
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Add_customer_Voice ad = new Add_customer_Voice(driver);
		ad.searchCustomerVoice();
		Thread.sleep(2000);
		String getdatafromExcel = elib.getdatafromExcel("Sheet1", 0, 2);
		ad.senddata(getdatafromExcel);
		ad.searchCustomerVoice1();
		Thread.sleep(3000);
		ad.addNEwCustomerVoice();
		Thread.sleep(2000);
		String getdata = elib.getdatafromExcel("Sheet1", 0, 3) + rlib.randomnum();
		ad.senddata1(getdata);
		ad.addNEwCustomerVoice1();
		Thread.sleep(2000);
		//assertEquals(false, "make a script fail ");

	}

	@Test(priority = 4) // (enabled = true)
	private void addCustomerLevel() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Add Customer Level']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control ktm-form-textbox']"));
		Thread.sleep(2000);
		Select sc = new Select(element);
		sc.selectByVisibleText("test2");
		Add_customer_lvl aa = new Add_customer_lvl(driver);
		aa.level();
	}

	@Test(priority = 5) // (enabled = true)
	private void addCustomerVoiceLevel() throws Throwable 
	{
	
		Thread.sleep(2000);
		Add_customer_lvl a2 = new Add_customer_lvl(driver);
		String data = elib.getdatafromExcel("Sheet1", 1, 0) + rlib.randomnum();
		a2.passdatain_txtfld(data);
		a2.clickbuttons();
		String data1 = elib.getdatafromExcel("Sheet1", 1, 1) + rlib.randomnum();
		a2.passdata_txtField(data1);
		Thread.sleep(2000);
		a2.clickbackbtn();
		//driver.close();
	}*/

	@Test//(priority = 6)
	private void product_Improvementpage() throws Throwable
	{
		wlib.maximizeWindow(driver);
		wlib.ImapliciateWaite(driver);
		Thread.sleep(3000);

		js = (JavascriptExecutor) driver;
		for (int i = 0; i < 2; i++) 
		{	
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}	
		Product_Improvement PI=new Product_Improvement(driver);
		PI.Product();
		js.executeScript("window.scrollBy(0,300)");
	}
	
	@Test//(priority = 7)
	private void sparePartCatalogue() throws Throwable 
	{
		wlib.maximizeWindow(driver);
		wlib.ImapliciateWaite(driver);
		Thread.sleep(2000);
		Spare_part_catalogue ss=new Spare_part_catalogue(driver);
		String urlp1 = elib.getdatafromExcel("Sheet1", 1, 2) + rlib.randomnum();
		String urlp2 = elib.getdatafromExcel("Sheet1", 1, 3) + rlib.randomnum();
		String urlp3 = elib.getdatafromExcel("Sheet1", 1, 4) + rlib.randomnum();
		ss.getAddurlbtn();
		ss.getUrltxtfld();
		ss.sparePart(urlp1,urlp2,urlp3);
		ss.getUploadbtn();
         List<WebElement> elements = driver.findElements(By.xpath("//a[@ngbtooltip='Publish']"));
	
		elements.get(0).click();
	//	ss.publish_notify();
	}
}
