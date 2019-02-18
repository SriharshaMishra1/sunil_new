package WebTableConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_skyscanner_youtube {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.skyscanner.co.in/");
		
		driver.findElement(By.cssSelector("//button[@id='depart-fsc-datepicker-button']/span[@class='DateInput--text-QamC7']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//button[@id='depart-calendar__bpk_calendar_nav_month_nudger_next']")).click();
		
		
	}
	

}
