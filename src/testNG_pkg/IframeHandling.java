package testNG_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandling {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver ();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void loginmthd()
	{
		WebElement username=driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys("sree987@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("987");
		
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		loginbtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		
		
	}
	
	@Test(priority=2)
	public void addPropertymthd()
	{
		WebElement AddPPTbtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		AddPPTbtn.click();
		
		WebElement FrameTag=driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(FrameTag);
		
		
		WebElement SummaryBox=driver.findElement(By.xpath("/html/body"));
		SummaryBox.click();
		SummaryBox.sendKeys("abcd");
		
		driver.switchTo().defaultContent();

	}
}
