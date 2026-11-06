package junit_pkg;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_linkcount {
 ChromeDriver driver;
	 
	 @BeforeEach
	 public void Browsersetup()
	 {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	 }
	 @Test
	 public void linkcountmethod()
	 {
		 List<WebElement> link=driver.findElements(By.tagName("a"));
		 System.out.println("Link count="+ link.size());
		 
		 for(WebElement li:link)
		 {
			// System.out.println("Link----"+li.getAttribute("href"));
			 System.out.println(li.getText()+"-----"+li.getAttribute("href"));//to reterive the a tag text.

		 }
	 }

}
