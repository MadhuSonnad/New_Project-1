package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_customer_Voice 
{
	public 	Add_customer_Voice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[.='Add Customer Voice'])[1]")
	private WebElement addCustomer;

	@FindBy(xpath="(//span[.='Search Customer Voice'])[1]")
	private WebElement SearechCustomerVoice;

	@FindBy(xpath="//input[@placeholder='Customer Voice']")
	private WebElement CustomerVoiceTextfld;

	@FindBy(xpath="//input[@placeholder='Customer Voice']")
	private WebElement CustomerVoiceTextfldPassdata;

	@FindBy(xpath="//button[.=' Search']")
	private WebElement SearchBtn;
	
	@FindBy(xpath="(//button[@type=\"button\"])[4]")
	private WebElement AddNEWcustomerVoice;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement customervoicetxtfld;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement customervoicetxtfldpassdata;
	
	@FindBy(xpath="(//button[@type=\"button\"])[5]")
	private WebElement Savebtn;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getSearechCustomerVoice() {
		return SearechCustomerVoice;
	}

	public WebElement getCustomerVoiceTextfld() {
		return CustomerVoiceTextfld;
	}

	public WebElement getCustomerVoiceTextfldPassdata() {
		return CustomerVoiceTextfldPassdata;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getAddNEWcustomerVoice() {
		return AddNEWcustomerVoice;
	}

	public WebElement getCustomervoicetxtfld() {
		return customervoicetxtfld;
	}

	public WebElement getCustomervoicetxtfldpassdata() {
		return customervoicetxtfldpassdata;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	public void searchCustomerVoice()
	{
		addCustomer.click();
		SearechCustomerVoice.click();
		CustomerVoiceTextfld.click();
	}
	
	public void senddata(String passdata)
	{
		CustomerVoiceTextfldPassdata.sendKeys(passdata);
	}
	public void searchCustomerVoice1()
	{
		SearchBtn.click();
	}
	public void addNEwCustomerVoice()
	{
		AddNEWcustomerVoice.click();
		customervoicetxtfld.click();
	}
	public void senddata1(String passdata1)
	{
		customervoicetxtfldpassdata.sendKeys(passdata1);
	}
	public void addNEwCustomerVoice1()
	{
		Savebtn.click();
	}
}