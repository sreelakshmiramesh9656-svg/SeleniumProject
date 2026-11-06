package pomTest_pkg;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomBase_pkg.Base_class;
import pomPage_pkg.Login_page;

public class Login_Test extends Base_class//to retrieve the driver information from base class
{
	
	Login_page obj;
	
	
	@BeforeMethod
	public void objectmthd()
	{
		 obj=new Login_page(driver);
		
	}
	
	@Test
	public void loginTest_mthd()
	{
		Login_page obj=new Login_page(driver);
		obj.setvalues();
		obj.Loginmthd();
		System.out.println(obj.titlemthd());
	}
	
	@Test
	public void titleverification()
	{
		System.out.println(obj.titlemthd());
	}
}
