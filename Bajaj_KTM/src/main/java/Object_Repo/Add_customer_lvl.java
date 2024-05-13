package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_customer_lvl {

	public Add_customer_lvl(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[.=' Add Customer Voice Level ']")
	private WebElement clickaddbtn;

	@FindBy(xpath="//input[@type='text']")
	private WebElement customervoicelvltxtfld;

	@FindBy(xpath="//input[@type='text']")
	private WebElement customervoicelvltxtfldpassdata;

	@FindBy(xpath="(//button[.=' Save'])[1]")
	private WebElement savebtn;

	@FindBy(xpath="(//span[@class='svg-icon svg-icon-3']/following::*)[7]")
	private WebElement arrowbtn;

	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement addbtn;

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement clicktxtfild;

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement passdataintxtfil;

	@FindBy(xpath="(//button[.=' Save'])[1]")
	private WebElement savebtnss;

	@FindBy(xpath="(//button[@type='button']//preceding::*//span)[.='Back']")
	private WebElement backbtn;

	public WebElement getClickaddbtn() {
		return clickaddbtn;
	}

	public WebElement getCustomervoicelvltxtfld() {
		return customervoicelvltxtfld;
	}

	public WebElement getCustomervoicelvltxtfldpassdata() {
		return customervoicelvltxtfldpassdata;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getArrowbtn() {
		return arrowbtn;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getClicktxtfild() {
		return clicktxtfild;
	}

	public WebElement getPassdataintxtfil() {
		return passdataintxtfil;
	}

	public WebElement getSavebtnss() {
		return savebtnss;
	}

	public WebElement getBackbtn() {
		return backbtn;
	}

	public void level() throws Throwable
	{
		clickaddbtn.click();
		customervoicelvltxtfld.click();
	}
	public void passdatain_txtfld(String passdataa)
	{
		customervoicelvltxtfldpassdata.sendKeys(passdataa);
	}
	public void clickbuttons() throws Throwable
	{
		savebtn.click();
		Thread.sleep(2000);
		arrowbtn.click();
		Thread.sleep(2000);
		addbtn.click();
		clicktxtfild.click();
	}
	public void passdata_txtField(String passdataas)
	{
		passdataintxtfil.sendKeys(passdataas);
	}
	public void clickbackbtn() throws Throwable
	{
		
		Thread.sleep(2000);
		savebtnss.click();
		Thread.sleep(2000);
		backbtn.click();
	}
}