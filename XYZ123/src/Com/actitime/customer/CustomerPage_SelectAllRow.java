package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomerPage_SelectAllRow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");;
		driver.findElement(By.name("pwd")).sendKeys("manager");;
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		
	}

}
