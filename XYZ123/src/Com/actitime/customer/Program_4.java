package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_4 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		WebElement wb=driver.findElement(By.id("identifierId"));
		wb.sendKeys("sri");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		//error msg verification
		String str1="Couldn't find your Google Account";
		WebElement ws=driver.findElement(By.xpath("//div[text()=\"Couldn't find your Google Account\"]"));
		String str2=ws.getText();
		System.out.println(str2);
		if(str1.equals(str2))
		{
			System.out.println("error msg pass");
		}
		else
		{
			System.out.println("error msg fail");
		}
		
		//error msg should be display in green color
		
		
		String expcolor="rgba(213, 0, 0, 1)";
		String actcolor=ws.getCssValue("color");
		System.out.println(actcolor);
		if(expcolor.equals(actcolor))
		{
			System.out.println("color is verified==>pass");
		}
		else
		{
			System.out.println("color is not verified==>fail");
		}
		
		
		
		
	}

}
