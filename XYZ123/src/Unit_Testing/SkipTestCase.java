package Unit_Testing;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(dependsOnMethods="createcustomerTest")
	public void DeleteCustomerTest()
	{
		System.out.println("execute dele HDFC customer");
	}
	
}

