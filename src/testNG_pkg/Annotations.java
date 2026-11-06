package testNG_pkg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeTest
	public void BeforeTest_mthd()
	{
		System.out.println("Before Test method---");
	}
	@BeforeClass
	public void BeforeClass_mthd()
	{
		System.out.println("BeforeClass method----");
	}
	
	@BeforeMethod
	public void mthd()
	{
		System.out.println("Beforemethod----");
	}
	@Test
	public void Testmthd_A()
	{
		System.out.println("Test Method A---");
	}
	
	@Test
	public void Testmthd_X()
	{
		System.out.println("Test Method X---");
	}
	@Test
	public void Testmthd_C()
	{
		System.out.println("Test Method C---");
	}
	@AfterMethod
	public void Af_mthd()
	{
		System.out.println("After method----");
	}
	@AfterClass
	public void After_class()
	{
		System.out.println("After class----");
	}
	@AfterTest
	public void After_test()
	{
		System.out.println("After Test----");
	}

}
