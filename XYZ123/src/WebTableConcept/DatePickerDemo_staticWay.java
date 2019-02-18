package WebTableConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo_staticWay {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	//dynamic wait
	//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/span")).click();
	Thread.sleep(2000);
	WebElement wb=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button"));wb.click();
	Thread.sleep(2000);
	WebElement wb1=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button"));wb1.click(); 
}
}
