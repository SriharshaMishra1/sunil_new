package Unit_Testing;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(dependsOnMethods="modifycustomerTest")
	public void DeleteCustomerTest()
	{
		System.out.println("execute delete HDFC customer");
	}
	@Test(invocationCount=4,invocationTimeOut=9000)
	public void modifycustomerTest() throws Throwable
	{
		Thread.sleep(2000);
		System.out.println("execute modify customer");
		
	}
}
