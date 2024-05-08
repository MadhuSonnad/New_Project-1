package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Improvement {

	public  Product_Improvement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[.='Product Improvement'])[2]")
	private WebElement productBTN;
	
	@FindBy(xpath="//button[.=' Download Excel Template']")
	private WebElement DownloadExcel;
	
	@FindBy(xpath="//button[.=' Send Notification']")
	private WebElement SendNotification;

	public WebElement getProductBTN() {
		return productBTN;
	}

	public WebElement getDownloadExcel() {
		return DownloadExcel;
	}

	public WebElement getSendNotification() {
		return SendNotification;
	}
	
	public void Product() throws Throwable
	{
		Thread.sleep(2000);
		productBTN.click();
		Thread.sleep(2000);
		DownloadExcel.click();
		Thread.sleep(2000);
		SendNotification.click();
	}
}
