package Object_Repo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spare_part_catalogue 
{
	public Spare_part_catalogue(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//div[.='Spare Part Catalogue']")
	private WebElement Sparepart;

	@FindBy(id="ktm-sidebar-right-toggle")
	private WebElement Addurlbtn;

	@FindBy(xpath="//input[@placeholder='Url']")
	private WebElement urltxtfld;

	@FindBy(xpath="//input[@placeholder='Url']")
	private WebElement urltxtfldpassdata;

	@FindBy(xpath="//input[@placeholder='Title']")
	private WebElement titletxtfld;

	@FindBy(xpath="//input[@placeholder='Title']")
	private WebElement titletxtfldpassadat;

	@FindBy(xpath="//textarea[@rows='4']")
	private WebElement description;

	@FindBy(xpath="//textarea[@rows='4']")
	private WebElement descriptionpassadata;
	
	@FindBy(xpath=" //button[.=' Upload']")
	private WebElement uploadbtn;

	@FindBy(xpath="//a[@ngbtooltip='Publish']")
	private List<WebElement> publishbtn;
	
	@FindBy(xpath="( //a[@ngbtooltip='Notify'])[2]")
	private WebElement Notifybtn;

	public WebElement getSparepart() {
		return Sparepart;
	}

	public WebElement getAddurlbtn() {
		return 
				Addurlbtn;
	}

	public WebElement getUrltxtfld() {
		return urltxtfld;
	}

	public WebElement getUrltxtfldpassdata() {
		return urltxtfldpassdata;
	}

	public WebElement getTitletxtfld() {
		return titletxtfld;
	}

	public WebElement getTitletxtfldpassadat() {
		return titletxtfldpassadat;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getDescriptionpassadata() {
		return descriptionpassadata;
	}

	public WebElement getUploadbtn() {
		return uploadbtn;
	}
	
	public List<WebElement> getPublishbtn() {
		return publishbtn;
	}

	public WebElement getNotifybtn() {
		return Notifybtn;
	}

public void sparePart(String data1,String data2,String data3) throws Throwable
{
	Sparepart.click();
	Thread.sleep(2000);
	Addurlbtn.click();
	urltxtfld.click();
	urltxtfldpassdata.sendKeys(data1);
	titletxtfld.click();
	titletxtfldpassadat.sendKeys(data2);
	description.click();
	descriptionpassadata.sendKeys(data3);
	uploadbtn.click();
	
}
public void publish_notify()
{
	
	publishbtn.get(0).click();
	Notifybtn.click();
}
}
