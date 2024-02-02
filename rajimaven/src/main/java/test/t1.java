package test;

import org.testng.annotations.Test;

public class t1 {
	
	@Test(priority=0,description="First",groups="L",invocationCount=10,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test(priority=1,description="second",groups="L")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,groups="K",timeOut=3000)
	public void m2() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Test case 3");
	}
}
