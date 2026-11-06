package testNG_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;//to access all drivers.
	
	@Parameters("Browser")
	
	@BeforeTest
	public void Browsersetup(String Browser)
	{
		if(Browser.equalsIgnoreCase("Chorme"))
		{
			driver=new ChromeDriver();
			System.out.println("Chrome browser");
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("Edge browser");
		}
		else
		{
			driver=new FirefoxDriver();
			System.out.println("FireFox Browser");
		}
	}

	@Test
	public void method1()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
