package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	String str=	driver.findElement(By.name("firstname")).getAttribute("aria-label");
		System.out.println(str);
		
		//check image is display or not
		WebElement wb =driver.findElement(By.xpath("//*[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
		boolean b=wb.isDisplayed();
		System.out.println(b);
		//get the location And size of the image
		Point p=wb.getLocation();
		System.out.println("get the x-cordinate="+p.getX());
		System.out.println("get the x-cordinate="+p.getY());
		//get size:
		Dimension d=wb.getSize();
		System.out.println("get height="+ d.getHeight());
		System.out.println("get width="+ d.getHeight());
		//male,female radio btn should be unselected:
		boolean b1=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(b1);
		Thread.sleep(3000);
		WebElement month_dd=driver.findElement(By.xpath("//*[@id='month']"));
		Select month_list=new Select(month_dd);
		//single select dropdown by  selectByindex
		 month_list.selectByIndex(3);
		 Thread.sleep(2000);
		//single select dropdown by selectByvisible text()
		 month_list.selectByVisibleText("Aug");
		 Thread.sleep(2000);
		 //single select dropdown by value
		 month_list.selectByValue("6");
		
		
	}

}
