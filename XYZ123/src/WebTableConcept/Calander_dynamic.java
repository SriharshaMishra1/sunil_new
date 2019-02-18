package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calander_dynamic {
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
			
			//*[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody//td"));
		int total_node=dates.size();
		for(int i=0;i<total_node;i++)
		{
			String date=dates.get(i).getText();
			
			if(date.equalsIgnoreCase("31"))
			{
				dates.get(i).click();
				break;
			}
		}
	}
		}
