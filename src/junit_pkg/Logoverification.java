package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
	ChromeDriver driver;
	
	@BeforeEach
	public void Browsersetup() {
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Logo() throws Exception {
		WebElement logo=driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result=logo.isDisplayed();
		
		if(result==true)
		{
		System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
		
		WebElement Female=driver.findElement(By.xpath("//input[@Value=\"f\"]"));
		boolean buttonenb=Female.isEnabled();
		System.out.println("Female button is enabled"+buttonenb);//to ensure the particular radio button is enabled or not.
		Female.click();
		
		Thread.sleep(2000);
		
		WebElement Checkbox=driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		boolean Checkboxbtn=Checkbox.isSelected();
		
		Checkbox.click();

		if(Checkboxbtn==true)
		{
		System.out.println("Chechbox is selected");	
		}
		else
		{
			System.out.println("Checkbox is not Selected");
			
		}
		
	}
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}

}
