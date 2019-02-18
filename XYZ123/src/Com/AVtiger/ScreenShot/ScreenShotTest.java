package Com.AVtiger.ScreenShot;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


	@Listeners(Com.AVtiger.ScreenShot.ListenerImpClass_Library .class)
	public class ScreenShotTest  extends BaseClass_DDL{
		
 @Test
 public void loginTest()
 {
	 String expPage="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	 String actPage=driver.getTitle();
	 Assert.assertEquals(actPage, expPage);
	 System.out.println("execute login Test");
 }
 @Test
 public void CreateLeads()
 {
	 System.out.println("execute new Leads");
 }
}
