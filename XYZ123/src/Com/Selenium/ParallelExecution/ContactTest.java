package Com.Selenium.ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.vtiger.customer.CustomWait_Opportunities;

public class ContactTest extends BaseClass_PEX {	
@Test
public void createcontactTest() throws Throwable 
{	
	System.out.println("Execute Createcontact test");
	/*WebDriver driver=new FirefoxDriver();*/
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("tiger");
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(5000);	
	//WebElement wb=driver.findElement(By.xpath("//tbody/tr/td[8]/a[@href='index.php?module=Contacts&action=index' and text()='Contacts']"));
	//wb.submit();
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
}
@Test
public void ModifyContactTest()
{
	System.out.println("execute modifycontactTest");
}
@Test
public void DeletecontactTest()
{
	System.out.println("execute  DeletecontactTest");
}
}
 