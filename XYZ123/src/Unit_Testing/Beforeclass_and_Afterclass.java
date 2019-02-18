package Unit_Testing;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeclass_and_Afterclass {
	
	@BeforeClass
	public void Bc()
	{
		System.out.println("======lounch the application=======");
	}
	
@BeforeMethod
public void Bm()
{
	System.out.println("===login===");
}


@Test
public void createcustomerTest()
{
	System.out.println("execute ctrate customer test");
}
@Test
public void deletecustomerTest()
{
	System.out.println("execute delete customer test");
}
@AfterMethod
public void am()
{
	System.out.println("==logout==");
}
@AfterClass
public void Ac()
{
System.out.println("====close the browser====");
}
}
