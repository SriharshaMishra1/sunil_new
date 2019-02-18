package WebTableConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class calender_handling {
           @Test
           public void displayCurrentSystemDateTest() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		// enter from
		WebElement wb = driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		wb.clear();
		wb.sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bangalore, India']")).click();
		Thread.sleep(2000);
		WebElement wbb = driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
		wbb.clear();
		Thread.sleep(1000);
		wbb.sendKeys("GOI");
		Thread.sleep(1000);
		WebElement wbd = driver.findElement(By.xpath("//span[text()='Goa, India']"));
		wbd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']"));
		Thread.sleep(2000);
		int monthcount = 0;
		                                              //nov-14
		while (monthcount < 13) {                  //table/tbody/tr[3]/td[@fare-date='1573669800000']/a[text()='14']
			                                        //dec-11
			                                //table/tbody/tr[3]/td[@fare-date='1576002600000']/a[text()='11']
			try {
				
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println("1st meet");
				//click on jan-10-2020
				driver.findElement(By.xpath("//tbody/tr[2]/td[@fare-date='1578594600000']/a")).click();
				break;
				
			    } 
			
		     	catch (Throwable t) {
				
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
				// ui-datepicker-group-last']/div[1]/a/span)[1]"));wb1.click();
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
				monthcount++;
			       }

		}
		// ((//span[text()='Next'])[1]
	}
}