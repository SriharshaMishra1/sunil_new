package Com.vtiger.customer;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

/**
 * 
 * 
 * @author sriharsha
 *
 */

public class FluentWait_Contact {
	public static void main(String[] args) throws InterruptedException {
		String username="admin";
		String password="tiger";
		String firstname="sriharsha";
		String lastname="mishra";
		String maillingstreet="Bhanjanagar";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(20,TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		//driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		/*login*/
		driver.navigate().to("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		/*Navigate to Contacts*/ 
		driver.findElement(By.linkText("Contacts")).click();
		/* click on lookup image*/    /**/  
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//select[@name='salutationtype']/option[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		//mailing street
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[19]/td[2]/textarea")).sendKeys(maillingstreet);
		/*save*/
		driver.findElement(By.xpath("//input[@name='button']")).click();
	}

}
