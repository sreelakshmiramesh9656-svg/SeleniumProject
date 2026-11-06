package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kerala_property_login {
	ChromeDriver driver;
	@BeforeEach
	public void Browsersetup()
	{
		 driver=new ChromeDriver();
		 driver.get("https://keralaproperty.in/member/login/");
		 driver.manage().window().maximize();//to maximize the window
	}
		
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("Title of the web page:"+actualtitle);
	}
	@Test
	public void testVerification()
	{
		String sourcecode=driver.getPageSource();//to retrieve the source code information
		if(sourcecode.contains("User Login"))
		{
			System.out.println("Test is present.");
		}
		else
		{
			System.out.println("Test is not present.");
		}
		}
		@Test
		public void login()
		{
		 WebElement username=driver.findElement(By.id("ulogin"));//locating username with locator id
		 username.sendKeys("Sree");//only String values are accepted
		 
		 WebElement password=driver.findElement(By.name("upass"));//locating password field with name 
		 password.sendKeys("pass098");
		 
		 WebElement Loginbutton=driver.findElement(By.id("sub_logbtn"));
		 Loginbutton.click();
		}
		@AfterEach
		public void closingmethod()
		{
			driver.quit();
	}
		
}
