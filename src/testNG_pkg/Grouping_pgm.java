package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm {
	
	@BeforeClass(alwaysRun=true)
	
	public void BeforeClass_mthd()
	{
		System.out.println("Beforeclass Z----");
	}
	
	@Test(priority=1,groups="Smoke")
	public void Test_mthd1()
	{
		System.out.println("Test method 1----");
	}
	
	@Test(priority=2,groups="Sanity")
	public void Test_mthd2()
	{
		System.out.println("Test method 2----");
	}
	
	@Test(priority=3,groups={"regression","smoke"})
	public void Test_mthd3()
	{
		System.out.println("Test method 3----");
	}
	
	@AfterClass(alwaysRun=true)
	public void AfterClass_mthd()
	{
		System.out.println("After class Method---");
	}

}
