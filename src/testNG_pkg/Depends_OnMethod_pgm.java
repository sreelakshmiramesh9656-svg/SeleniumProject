package testNG_pkg;

import org.testng.annotations.Test;

public class Depends_OnMethod_pgm {
	
	@Test
	public void Reg()
	{
		System.out.println("Registration Method");
	}

	@Test(dependsOnMethods = "Reg")//login method is depends on the reg() method so it will work only after execute
	public void Login()
	{
		System.out.println("Login Method");
	}
	@Test (dependsOnMethods= {"Reg","Login"})
	public void Home()
	{
		System.out.println("Home method");
	}
}
