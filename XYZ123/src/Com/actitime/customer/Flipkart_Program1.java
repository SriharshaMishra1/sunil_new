package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
	WebElement wb=	driver.findElement(By.xpath("//input[@name='q']"));
	wb.sendKeys("iphone 10");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
String str=	driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
	System.out.println(str);
	String[] arr=str.split(" ");
/*	if(arr[].equals(" "))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}    */
	driver.close();
	}

}
