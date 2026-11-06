package junit_pkg;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_pgm 
{
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	
	public void Screen_mthd() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileHandler.copy(s,new File("C:\\Users\\SPIDER\\Desktop\\Selenium works\\Screenshot\\Rediff.png"));
		
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		File logoscreenshot=logo.getScreenshotAs(OutputType.FILE);	
						
		FileHandler.copy(logoscreenshot,new File("C:\\Users\\SPIDER\\Desktop\\Selenium works\\Screenshot\\logo.png"));
	}
	
}
