package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver. manage().window().maximize();
	}
	@Test
	public void Home() throws Exception
	{
		Thread.sleep(2000);//java wait,used to wait for a particular time period.here it is 2sec.
		WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("Mobiles");
		search.sendKeys("Mobiles",Keys.ENTER);//TO PRESS THE ENTER KEY
		
		
		WebElement electronics=driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/ul/li[6]/div/a[1] "));
		electronics.sendKeys("El");
		
	}
	

}
