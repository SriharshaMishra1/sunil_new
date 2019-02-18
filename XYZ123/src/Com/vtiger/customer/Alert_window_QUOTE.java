package Com.vtiger.customer;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Alert_window_QUOTE {
	public static void main(String[] args) throws InterruptedException {
		String username="admin";
		String password="tiger";
		String organizationName="Qspider";
		String LastName="Mishra";
		String organisationName1="HDFC";
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.navigate().to("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//Organisatin:
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//Memberof Lookup image:
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/child::img")).click();
		Set<String> set=driver.getWindowHandles();
		System.out.println("parent window handled");
		Iterator<String> it=set.iterator();
		String parentwin=it.next();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		driver.findElement(By.xpath(".//*[@id='search_txt']")).sendKeys(organizationName);
		driver.findElement(By.xpath("//input[@name='search']")).click();
		driver.findElement(By.xpath("//a[text()='Qspider']")).click(); 
		Thread.sleep(4000);
		driver.switchTo().window(parentwin);
		
		
		
		
		//Quote Creation
	     driver.findElement(By.linkText("More")).click();
	     driver.findElement(By.linkText("Quotes")).click();
	     driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
	     //Thread.sleep(500);
	     //driver.findElement(By.xpath(" //input[@name='subject']")).sendKeys("smart_key");
	    
	    //driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='contact_name']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
	    driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/img")).click();
	     Thread.sleep(1000);
			 Set<String>set1=driver.getWindowHandles(); 
			 Iterator<String>it1=set1.iterator();
			 String parentwindow1=it1.next();                  
			 String childwindow1=it1.next();
			 driver.switchTo().window(childwindow1);
			 System.out.println("after clicking on + contact2");
			 Thread.sleep(4000);
			 driver.findElement(By.id("search_txt")).sendKeys(LastName);
			// driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td/form/table/tbody/tr[1]/td[4]/input")).click();
			 driver.findElement(By.xpath("//input[@name='search']")).click();
			 Thread.sleep(8000);
			 System.out.println("check this");
			// driver.findElement(By.xpath("//a[contains(text(),'"+LastName+"')]")).click();
			 driver.findElement(By.xpath("//a[text()='sriharsha mishra']")).click();
			 Thread.sleep(8000);
			 driver.switchTo().alert().accept();
			 System.out.println("after clicking on "); 
			 Thread.sleep(2000);
			
			 driver.switchTo().window(parentwindow1);   
			 
			 
			  //Organisation Name:
			 System.out.println("comes to organisation lookup img");
			 //driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@id='single_accountid']/following-sibling::input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
			 driver.findElement(By.xpath("//table[@class='small']/tbody/tr[7]/td[4]/img")).click();
			   Thread.sleep(2000);
			     Set<String>set2=driver.getWindowHandles();
				 
				 Iterator<String>it2=set2.iterator();
				 String parentwindow2=it2.next();
				 String childwindow2=it2.next();
				 driver.switchTo().window(childwindow2);
				 
				 System.out.println("after clicking on + contact3");
				 
				 driver.findElement(By.id("search_txt")).sendKeys(organisationName1);
				 driver.findElement(By.xpath("//input[@name='search']")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
				 System.out.println("after clicking on ");
				  driver.switchTo().window(parentwindow2);
				 	     Thread.sleep(2000);
				 	    driver.switchTo().window(parentwindow2);  
				 	   System.out.println("comes to organisation lookup img but not Handle");

	
		
		
		

			 
	}

}
