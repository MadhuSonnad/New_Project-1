package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userNameTextField;

	@FindBy(xpath="//input[@type='password']")
	private WebElement passWordTextField;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;

	public WebElement getUserNameTextField()
	{
		return userNameTextField;
	}
	public WebElement getPassWordTextField()
	{
		return passWordTextField;
	}
	public WebElement getSubmitbutton()
	{
		return submitbutton;
	}
	public void login(String UserName,String PassWord)
	{
		userNameTextField.sendKeys(UserName);
		passWordTextField.sendKeys(PassWord);
		submitbutton.click();
	}
}
