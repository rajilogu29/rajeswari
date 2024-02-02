package testdep;

import org.testng.annotations.Test;

public class dg {
	
	@Test(priority=0,groups="M")
	public void m1()
	{
		System.out.println("m1");
	}
	
	@Test(priority=1,groups="M")
	public void m2()
	{
		System.out.println("m2");
	}
	
	
	
	@Test(priority=2,groups="M")
	public void m3()
	{
		System.out.println("m3");
	}
	
	@Test(priority=3,dependsOnGroups="M")
	public void m4()
	{
		System.out.println("m4");
	}

}
