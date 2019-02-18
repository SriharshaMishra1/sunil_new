package Unit_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_AND_aftetmethod {
@BeforeMethod
public void BM()
{
	System.out.println("===login====");
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


}
