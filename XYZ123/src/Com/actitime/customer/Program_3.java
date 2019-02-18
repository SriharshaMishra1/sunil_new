package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	//maximize window
	//driver.manage().window().maximize();
	//get URL
	driver.get("https://www.gmail.com");
	//verify login page
	String exppage="Gmail";
	String actpage=driver.getTitle();
	if(exppage.equals(actpage))
	{
		System.out.println("verified==>pass");
	}
	else
	{
		System.out.println("Not verified==>Fail");
	}
//login into Gmial:
	
	//using webelent puting id
		WebElement wb=driver.findElement(By.id("identifierId"));
		wb.sendKeys("sriharsha1964@gmail.com");
	//using driver get next btn
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	//pwd
	driver.findElement(By.name("password")).sendKeys("85120271322");
	//using driver get next btn
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2000);
	
	//verify Home Page:
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String rr="Gmail";
		String ss=driver.getTitle();
		if(ss.contains(rr))
		{
			System.out.println("HOME page validation pass");
		}
		else
		{
			System.out.println("HOME page validation fail");
		}
		//logout
	driver.findElement(By.xpath("	//*[@class='gb_cb gbii']")).click();
	driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		
		
}
}
