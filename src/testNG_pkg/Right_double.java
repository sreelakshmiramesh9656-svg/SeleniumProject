package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Right_double {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Log() throws Exception 
	{
		Thread.sleep(2000);
		
		WebElement doublebtn = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act=new Actions(driver);
		act.doubleClick(doublebtn);
		
		Thread.sleep(2000);
		WebElement rightbtn = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(rightbtn);

		act.perform();
	}

}
