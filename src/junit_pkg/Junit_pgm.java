package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm {
	ChromeDriver Driver;
	@BeforeEach
	public void Browsersetup()
	{
		System.out.println("BeforeEach Method");
		Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
	}
	@Test
	public void titleverification() 
	{
	System.out.println("Test Method1");

	String actualtitle = Driver.getTitle();
	String ExpectedTitle ="Google";
	
	if (ExpectedTitle.equals(actualtitle)) 
	{
		System.out.println("Same Title");
	}
	else
	{
		System.out.println("Mismatch Title");
	}
	
	}
	@Test
	public void method2() 
	{
		System.out.println("method2");
	}
	@AfterEach
	public void closingmethod() 
	{
		System.out.println("AfterEach Method");

		//Driver.close();//to close the browser tab.
		Driver.quit();
	}
}
