package Com.vtiger.customer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCustomer {
public static void main(String[] args) throws InterruptedException {
	String username="admin";
	String password="tiger";
	String firstname="sriharsha";
	String lastname="mishra";
	String company="oracle";
	String title="newcustome";
	String mob="8597364951";
	String address="munnekolal";
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/*login*/
	driver.navigate().to("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	/*Navigate to leads*/
	driver.findElement(By.linkText("Leads")).click();
	/* click on lookup image*/    /**/  
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	//click Mr. to dynamic table:
	driver.findElement(By.xpath("//select[@name='salutationtype']/child::option[2]")).click();
	/**/ 
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
	driver.findElement(By.xpath("//*[@name='designation']")).sendKeys(title);
	driver.findElement(By.xpath("//select[@name='leadsource']/child::option[2]")).click();
	driver.findElement(By.xpath("//select[@name='industry']/child::option[15]")).click();
	/*mob no*/ 
	driver.findElement(By.xpath("//table[@class='small']/tbody/tr[5]/td[4]/input")).sendKeys(mob);
	//leadstatus
	 driver.findElement(By.xpath("//select[@name='leadstatus']/child::option[4]")).click();;
	Thread.sleep(2000);
	//Address Info
	driver.findElement(By.xpath("//table/tbody/tr[13]/td[2]/textarea[@name='lane']")).sendKeys(address);
	/*save*/
	WebElement wb=driver.findElement(By.xpath("//input[@name='button']"));
	wb.click();
	/*int count=0;
	while(count<2)
	try {
		wb.isDisplayed();
		break;
	}
	catch(Throwable e)
	{
		System.out.println("handled situation");
		Thread.sleep(1000);
		count++;
	}*/
	
	CustomWait_Opportunities wait=new CustomWait_Opportunities();
	wait.CustomWait_Opportunities(wb);
}
}
