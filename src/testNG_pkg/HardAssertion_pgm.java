package testNG_pkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertion_pgm {
	ChromeDriver driver;
	
	@BeforeClass
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void title_verification()
	{
		String actual_title=driver.getTitle();
		//System.out.println(actual_title);
		
		String expected_title="Rediffmail Free Unlimited";
		Assert.assertEquals(expected_title, actual_title);
		
		System.out.println("Success");//only execution after the assertion passed.
		

	}
	@Test(priority = 2)
	public void URL_verification()
	{
		String actual_URL=driver.getCurrentUrl();
		System.out.println(actual_URL);
		
		String expected_URL="https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(expected_URL,actual_URL);
		System.out.println("URL verification completed");
	}
}
	