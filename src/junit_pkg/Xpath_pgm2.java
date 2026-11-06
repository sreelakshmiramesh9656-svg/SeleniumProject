package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_pgm2 {
ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		WebElement link=driver.findElement(By.xpath("//p[@id=\"signin_info\"]"));
		link.sendKeys("abc");
		
		WebElement password=driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("password123");
		
		WebElement submittbutton=driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		submittbutton.click();
}
}