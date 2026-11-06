package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_pgm {
	
	@BeforeClass
	public void BeforeClass_mthd1()
	{
		System.out.println("BeforeClass Method--");
	}
	
	
	@Test(priority=1,invocationCount =3)
	public void mthd_X()
	{
		System.out.println("Method X--");
	}
	
	@Test(priority=2,enabled = false)
	public void mthd_A()
	{
		System.out.println("Method A--");
	}
	
	@Test(priority=3)
	public void mthd_C()
	{
		System.out.println("Method C--");
	}
	
	@AfterClass
	public void aft_mthd()
	{
		System.out.println("AfterClass Method--");
	}
}
