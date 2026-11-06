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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling_pgm2 {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testwindow()throws Exception
	{
				
		String parent_window=driver.getWindowHandle();
		System.out.println("Title of tabbed window:"+driver.getTitle());
	
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button1.click();
		
		ArrayList<String>windowdetails=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(1));
		
		
		System.out.println("Title of Seleniumwindow: "+driver.getTitle());
		
		driver.switchTo().window(parent_window);
		driver.navigate().refresh();
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		button2.click();
		WebElement window_button = driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
		window_button.click();
		
		System.out.println("Title of selenium widow: "+driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_window);
		
		WebElement button3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button3.click();
		WebElement multiple_window = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		multiple_window.click();
		
		ArrayList<String>windowdetails1=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(2));
		System.out.println("Title of Selenium window : "+driver.getTitle());
		
		
	}	
	
	@AfterTest
	public void closing_metthod()
	{
		driver.quit();
	}
}
