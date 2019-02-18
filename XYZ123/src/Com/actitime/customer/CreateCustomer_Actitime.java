package Com.actitime.customer;
/*
 * 
 * @author Sriharsha
 * 
 */

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCustomer_Actitime {
	public static void main(String[] args) throws InterruptedException {
		Random num=new Random();
		String username="admin";
		String password="manager";
		String customername="ICICI_001"+num.nextInt(100);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='TASKS']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//*[text()='Create Customer']")).click();
		//create new customer
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys(customername);
		driver.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("new customer page created");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']/div/span")).click();
		
		driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
	}

}
