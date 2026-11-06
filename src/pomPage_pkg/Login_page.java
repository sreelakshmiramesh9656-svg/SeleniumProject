package pomPage_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	//Locating webelements using page factory
	
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement Loginbtn;

	//Constructor
	public Login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void setvalues()
	{
		username.sendKeys("sree");
		password.sendKeys("123");
	}
		public void Loginmthd()
		{
			Loginbtn.click();
		}
		
		public String titlemthd()
		{
			String Title=driver.getTitle();
			return Title;
		}

}
