package Com.actitime.customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;
import com.thoughtworks.selenium.webdriven.commands.GetAllWindowTitles;
public class Program1 {
	public static void main(String[] args) throws InterruptedException {
	//1st way:
		//FirefoxDriver driver=new FirefoxDriver();
    //2nd way:	
		WebDriver driver=new FirefoxDriver();
		
	//driver.get("http://gmail.com");
		//driver.get("https://accounts.google.com/signin");
		driver.navigate().to("https://accounts.google.com/signin");
		//id
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("sriharsha1964@gmail.com");
		
		//capture title
		String str=driver.getTitle();
		System.out.println(str);
		if(str.equals("Sign in – Google accounts"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	//geturl	
		
		System.out.println(driver.getCurrentUrl());
		
		//next btn
		WebElement wb=driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']/span[@class='RveJvd snByac']"));
		wb.click();
	

	}

}
