package Com.vtiger.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author sriharsha
 *
 */

public class CustomWait_Opportunities {
	
	
		public void CustomWait_Opportunities(WebElement wb) throws InterruptedException {
		
		int count=0;
		while(count<20)
		{
			try
			{
				wb.isDisplayed();
				break;
			}
			catch(Throwable t)
			{
				System.out.println("Handle the Exception and Continue");
				Thread.sleep(1000);
				count++;
			}
		}
		
		}
}
		

