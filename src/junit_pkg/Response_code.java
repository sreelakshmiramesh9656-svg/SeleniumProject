package junit_pkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response_code {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void Browsersetup() {
		
		driver= new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception {
		String url=driver.getCurrentUrl();//to retrieve the current URL.
		URI obj=new URI(url);//to verify 
		URL link=obj.toURL();
		HttpURLConnection con=(HttpURLConnection)link.openConnection();
		int Responsecode =con.getResponseCode();
		System.out.println("Responsecode is "+Responsecode);
		
		if(Responsecode==200)
		{
			System.out.println("valid link");
		}
		else if(Responsecode==404)
		{
			System.out.println("Broken link");
		}
		else
		{
		
		System.out.println("Other Responsecode");
	}

}
}
