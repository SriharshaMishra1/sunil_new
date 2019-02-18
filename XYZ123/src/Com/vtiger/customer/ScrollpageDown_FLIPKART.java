package Com.vtiger.customer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollpageDown_FLIPKART {
	public static void main(String[] args) throws InterruptedException {
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
	    ((JavascriptExecutor)driver).executeScript("scroll(200,1500)");

		
	}

}
