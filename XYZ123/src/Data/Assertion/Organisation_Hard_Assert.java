package Data.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Organisation_Hard_Assert {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("tiger");
	Thread.sleep(4000);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Yesb Bank");
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	boolean status=driver.findElement(By.xpath("//span[contains(@class,'dvHeaderText')]")).isDisplayed();
	Assert.assertTrue(status);
	System.out.println(status);
	//String expecte="HDFC";
	//Assert.assertEquals(data, expecte);
	
	
}
}
