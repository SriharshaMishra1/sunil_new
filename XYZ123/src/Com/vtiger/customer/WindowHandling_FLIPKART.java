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

public class WindowHandling_FLIPKART {
		public static void main(String[] args) throws InterruptedException{
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
		   // JavascriptExecutor js=(JavascriptExecutor)driver;
		   // js.executeScript("window.scrollBy(0,2000)");
		    ((JavascriptExecutor)driver).executeScript("scroll(0,170)");
		   WebElement wc= driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 256 GB)']"));
		   wc.click();
		    //click iphone link its open child window
		    Set<String> set=driver.getWindowHandles();
		    Iterator<String> it=set.iterator();
		    String parentwin=it.next();
		    String childwin=it.next();
		    //passdriver control to child win
		    driver.switchTo().window(childwin);
		    //Click buy now button
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		   driver.close();
		    driver.switchTo().window(parentwin);
		    //search Bar
		  WebElement wb=  driver.findElement(By.xpath("//input[@name='q']"));
		  wb.clear();
		  wb.sendKeys("nokia",Keys.ENTER);

			
}
}
	