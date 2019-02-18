package Com.crm.include_exclude;

import org.testng.annotations.Test;

public class Include_excludeTest {
	
	@Test(groups= {"include-group"})
	public void CampaignTest()
	{
		System.out.println("execute campaignTest");
	}
	@Test(groups= {"include-group"})
	public void ModifyCampaignTest()
	{
		System.out.println("execute ModifyTest");
	}
	@Test(groups= {"include-group","exclude-group"})
	public void DeleteCampaignTest()
	{
		System.out.println("execute DeleteTest");
	}
}


