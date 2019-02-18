package Com.vtiger.customer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * 
 * @author sriharsha
 *
 */
public class SynchronisationPgm {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	
	
	
}
}
