package Data_Provider_Annotation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import DataDrivenTesting.DataDriven_ExcelSheet_Library;
import DataDrivenTesting.FileUtils;
import DataDrivenTesting.FileutilsEXCELsheet_Library;

public class Amazon_Bye_test {
  public WebDriver driver;
	
	@Test(dataProvider="getData")
	public void createproductsTest(String username,String password) throws Throwable {
		driver=new FirefoxDriver();
		System.out.println("Execute Createcontact test");
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Products")).click();
		Assert.assertTrue(driver.getTitle().contains("Administrator"),"user is not able to "
				+ "login-Invalid Credentials");
		System.out.println("Page title Verified User is able to login successful");
		
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
/*	public String[][] Object;
	@Test(dataProvider="getData")
	public void addTocart(String Pname,String Qty,String Colr)
	{
		System.out.println("login==>"+Pname+"==>"+Qty);
	}
	*/
	
	@DataProvider(name="getData")
	public Object[][] passdata() 
	{
		
		Fileutils_DPA flib=new Fileutils_DPA("C:\\Users\\sriharsha\\eclipse-workspace\\Selenium_new123\\src\\Data_Provider_Annotation\\dataprovider.xlsx");
		int rows=flib.getRowCount(1);
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=flib.getdata(1, i, 0);
			data[i][1]=flib.getdata(1, i, 1);
		}
		
		
		return data;
		
		/*Object[][] ObjArr=new Object[5][3];
		ObjArr[0][0]="i phone-7";
		ObjArr[0][1]="2";
		ObjArr[0][2]="black";
		ObjArr[1][0]="nokia";
		ObjArr[1][1]="10";
		ObjArr[1][2]="blue";
		ObjArr[2][0]="Samsung";
		ObjArr[2][1]="5";
		ObjArr[2][2]="green";
		ObjArr[3][0]="moto";
		ObjArr[3][1]="1";	
		ObjArr[3][2]="white";
		ObjArr[4][0]="sony";
		ObjArr[4][1]="1";
		ObjArr[4][2]="grey";*/
			
	
			
		}
		
	

}
