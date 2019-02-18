package Com.vtiger.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * 
 * @author sriharsha
 *
 */

public class ExplicitlyWait_Organization {
	public static void main(String[] args) throws InterruptedException {
		String username="admin";
		String password="tiger";
		String organizationName="Qspider";
		String employees="OracleEmp";
		String billingAddress="Chennai";
		String shippingAddress="Bangalore";
		String orgsearch="Q";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		/*login*/
		driver.navigate().to("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		/*create Organization*/
		driver.findElement(By.linkText("Organizations")).click();;
		/*click lookup image*/
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Thread.sleep(2000);
		/*//member of:
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/child::img[@src='themes/softed/images/select.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys("Qspiser");
		driver.findElement(By.xpath("//input[@name='search']")).click();*/
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(organizationName);
		//driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]/input")).sendKeys(employees);
		driver.findElement(By.xpath("//select[@name='industry']/child::option[11]")).click();
		driver.findElement(By.xpath("//select[@name='accounttype']/child::option[6]")).click();
		/*Address Information*/
		driver.findElement(By.xpath("//table/tbody/tr[14]/td[2]/textarea[@name='bill_street']")).sendKeys(billingAddress);
		driver.findElement(By.xpath("//table/tbody/tr[14]/td[4]/textarea[@name='ship_street']")).sendKeys(shippingAddress);
		/*Save*/
		driver.findElement(By.xpath("//table/tbody/tr[22]/td/div/input[1]")).click();
		
	}

}
