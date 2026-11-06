package junit_pkg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void Browsersetup()
	{
		
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/SPIDER/Desktop/Alert.html");
	driver.manage().window().maximize();
	}
	
	@Test
	public void Display_alertbox() throws Exception
	{
		WebElement Display_alertbox=driver.findElement(By.xpath("/html/body/input[1]"));
		Display_alertbox.click();
		
		//handle alert box
		Alert alrt=driver.switchTo().alert();//switch to alert box
		String alert_text=alrt.getText();//to retrieve the text from the alert box
		System.out.println("alert text :"+alert_text);
		
		Thread.sleep(2000);
		alrt.accept();//to click the 'ok' button of the alert box 
		
		
		WebElement First_name=driver.findElement(By.xpath("/html/body/input[2]"));
		First_name.sendKeys("sree");
		

		WebElement Last_name=driver.findElement(By.xpath("/html/body/input[3]"));
		Last_name.sendKeys("R");
		
		WebElement Submit_button=driver.findElement(By.xpath("/html/body/input[4]"));
		Submit_button.click();
		
	}
	

}
