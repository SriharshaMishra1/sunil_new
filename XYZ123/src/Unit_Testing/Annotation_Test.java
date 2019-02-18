package Unit_Testing;

import org.testng.annotations.Test;

/*
 * 
 * @Author sriharsha
 * 
 */

public class Annotation_Test {
	
	
	@Test(dependsOnMethods="modifycustomerTest")
	public void DeleteCustomerTest()
	{
		System.out.println("execute delete HDFC customer");
	}
	

	@Test
	public void createcustomerTest()
	{
		System.out.println("execute create customer");
	}
	
	@Test(invocationCount=4,invocationTimeOut=9000)
	public void modifycustomerTest() throws Throwable
	{
		Thread.sleep(2000);
		System.out.println("execute modify customer");
		
	}
	@Test
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteCustomerTest");
	}

	
}
