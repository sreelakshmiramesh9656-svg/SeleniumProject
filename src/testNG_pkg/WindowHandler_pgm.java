package testNG_pkg;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WindowHandler_pgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent_window=driver.getWindowHandle();

	
		WebElement searchBar=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchBar.sendKeys("Mobiles");
		
		WebElement icon=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		icon.click();
		
		WebElement phnLink=driver.findElement(By.xpath("/html/body/div[1]/div[1]/span[1]/span/div[1]/div[4]/div/div/div/div/span/div/div[1]/div[2]/div/div/div[1]/span[2]/a/span/span/h2/span"));
		phnLink.click();
		
		//ArrayList<String>windowdetails=new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().window(windowdetails.get(1));
		
		Set<String> tabdetails=driver.getWindowHandles();
		
		for(String handle:tabdetails)
		{
			
			if(handle.equalsIgnoreCase(parent_window))
			{
				
			driver.switchTo().window(handle);
			File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(s,new File(" "));
			System.out.println("Screenshot Saved Successfully!! ");
			}
			
		}
	}
	
}