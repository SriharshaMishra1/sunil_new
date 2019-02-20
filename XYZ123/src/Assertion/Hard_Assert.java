package Assertion;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Hard_Assert {
	
	@Test
		public void createcampaignTest()
		{
			System.out.println("step1");
			System.out.println("step2");
			System.out.println("step3");
			Assert.assertEquals("BannerAds", "Ads");
			System.out.println("step4");
			System.out.println("++++++++++++++++");
		}
	@Test
	public void createContactwithCampaignTest()
	{   
		System.out.println("===========");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
		System.out.println("-------------------");
	}
}
