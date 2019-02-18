package Com.actitime.customer;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		//enter from
	WebElement wb=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
	wb.clear();
	wb.sendKeys("BLR");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Bangalore, India']")).click();
	Thread.sleep(2000);
	WebElement wbb=driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
	wbb.clear();
	Thread.sleep(1000);
	wbb.sendKeys("GOI");
	Thread.sleep(1000);
	WebElement wbd=driver.findElement(By.xpath("//span[text()='Goa, India']"));
	wbd.click();
	Thread.sleep(2000);
	/*//get the current system date dd:mm:yy format
	String nextdate=getcurrentsystemdate();
	String[] datearr=nextdate.split(":");
	String day=Integer.parseInt(datearr[0]+1+"";
	String month=datearr[1];
	String year=datearr[2];
	//create a dynamic xpath using systm date:
	String x="(//td[@data-year=' "+year+" 'and  @data-month='"+month+"']/a[text()=
	}

	public static String getcurrentsystemdate()
	{
		Date date=new Date();
          String[] dateformat=date.toString().split(" ");
          //get the current day from the date object:
       int day =date.getDate();
       String sday=day +" ";
       //get month from the date objects:
       int month=date.getMonth();
       String smonth=month+" ";
       //get the current year:
       String year=dateformat[5];
       return sday+":"+smonth+":"+year;
	*/
	}
}


