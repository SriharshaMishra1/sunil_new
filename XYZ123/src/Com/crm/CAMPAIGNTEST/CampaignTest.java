package Com.crm.CAMPAIGNTEST;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Selenium.ParallelExecution.BaseClass_PEX;

public class CampaignTest extends BaseClass_PEX{
	

	@Test(groups= {"smokeTest"})
	public void CreateCampaignTest()
	{
		System.out.println("execute createcampaigntest");
	}
	
	@Test(groups= {"regrationTest","smokeTest"})
	public void ModifyCampaignTest()
	{
		System.out.println("execute ModifyTest");
	}
	@Test(groups= {"smokeTest"} )
	public void DeleteCampaignTest()
	{
		System.out.println("execute DeleteTest");
	}
	@Test(groups={"regrationTest","smokeTest"})
	public void SriharshaTest()
	{
		System.out.println("execute my testcase");
	}
}
