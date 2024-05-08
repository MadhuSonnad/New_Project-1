package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bannerupload {

	public Bannerupload(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radiobtn;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement Titletxtfld;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement TitletxtfldPassdata;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement VideoURL;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement VideoURLpassdata;
	
	@FindBy(xpath="//button[.=' Upload']")
	private WebElement uploadBtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getTitletxtfld() {
		return Titletxtfld;
	}

	public WebElement getTitletxtfldPassdata() {
		return TitletxtfldPassdata;
	}

	public WebElement getVideoURL() {
		return VideoURL;
	}

	public WebElement getVideoURLpassdata() {
		return VideoURLpassdata;
	}

	public WebElement getUploadBtn() {
		return uploadBtn;
	}
	public void bannerUpload()
	{
	radiobtn.click();
	Titletxtfld.click();
	VideoURL.click();
	uploadBtn.click();
	}
	public void passvlu (String Passdata) throws Throwable
	{
		
		TitletxtfldPassdata.sendKeys(Passdata);
	}
	public void passingdata(String pasdat) throws InterruptedException
	{
	Thread.sleep(3000);
	VideoURLpassdata.sendKeys(pasdat);
	uploadBtn.click();
}
}
