package Unit_Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
	@Test
	public void createcustomerTest()
	{
		Reporter.log("login to application",true);
		Reporter.log("navigate to Task",true);
		Reporter.log("create customer",true);
		Reporter.log("not verify customer",false);
		Reporter.log("logout",true);
	}

}
