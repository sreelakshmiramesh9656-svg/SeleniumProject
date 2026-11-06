package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_pgmLogin {
	ChromeDriver driver;
	@BeforeEach
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login()
	{
	 WebElement username=driver.findElement(By.id("username"));
	 username.sendKeys("Sree");//only String values are accepted
	 
	 WebElement password=driver.findElement(By.name("password"));
	 password.sendKeys("123");
	 
	 WebElement submit=driver.findElement(By.id("submit"));
	 submit.click();
	}
	 
	// @AfterEach
	// public void closingmethod()
	 //{
	//	 driver.quit();
	// }
	}