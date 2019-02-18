package Com.vtiger.customer;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_window_Operation {
	public static void main(String[] args) throws Throwable {
			String un="8512027132";
			String pwd="8512027132";
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com");
			//after open www.flipkart.com login window come to close xpath
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 10",Keys.ENTER);
	  String exptitle="iphone 7";
	  String parentid=driver.getWindowHandle();
	  Set<String> set1=driver.getWindowHandles();
	  Iterator<String> it1=set1.iterator();
	  for(int i=0;i<=set1.size();i++)
	  {
		  driver.switchTo().window(it1.next());
		  if(driver.getTitle().equals(exptitle))
		  {
			  break;
		  }
	  }
	  
	  driver.switchTo().window(parentid);
	}

}
