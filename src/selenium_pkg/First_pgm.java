package selenium_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_pgm 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FireFoxDriver driver=new FireFoxDriver();
		driver.get("https://www.google.com/");
		String actultitle = driver.getTitle();//to Retrieve the title of a web application.
		System.out.println("The Title of the Web Application is :"+ actultitle);
		
		String Expectedtitle= "Google";
		
		if (actultitle.equals(Expectedtitle)) {
			System.out.println("The title's matches");
		}
		else {
			System.out.println("Title is not matched");
		}
	}
}















