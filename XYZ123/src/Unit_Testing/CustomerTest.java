package Unit_Testing;

import org.testng.annotations.Test;

public class CustomerTest extends BaseClass_DD{
	
	@Test
	public void createcustomerTest()
	{
		System.out.println("execute create customer");
	}
	@Test
	public void modifycustomerTest()
	{
		System.out.println("execute modifycustomer");
	}
    @Test
    public void deletecustomerTest()
    {
    	System.out.println("execute  deletecustomer ");
    }
}
