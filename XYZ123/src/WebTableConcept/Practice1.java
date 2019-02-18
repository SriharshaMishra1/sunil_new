package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import FileDownload_Window.WebDriverUtils_LIBRARY;

public class Practice1 {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/span")).click();
		Thread.sleep(2000);
		String expmonth="Apr 2019";
		//next
	//	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		Thread.sleep(2000);
		String currentmonth=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
		if(expmonth.equals(currentmonth))
		{
			System.out.println("month is already selected");
		}
		else {
			for(int i=1;i<12;i++)
			{
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
				Thread.sleep(2000);
				currentmonth=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
				if(expmonth.equals(currentmonth))
				{
					System.out.println("month is already selected");
				}
			}
		}
		
}
}
