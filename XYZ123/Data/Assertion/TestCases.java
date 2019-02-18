package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
SoftAssert s=new SoftAssert();
	@Test
	public void test()
	{
		
		System.out.println("test1");
		
		Assert.assertEquals(true, true);   //HA
		System.out.println("test2");
		
		Assert.assertEquals(true, true); 
		
		System.out.println("test3");
		
		s.assertEquals(true,false); //Soft Assertion
		
		System.out.println("test4");
		System.out.println("test5");
		System.out.println("test6"); 
		System.out.println("test7");
		System.out.println("test8");
		s.assertAll();
	}
	
	
}
