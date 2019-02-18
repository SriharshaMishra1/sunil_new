package WebTableConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender_Spicejet_YOUTUBE {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("http://spicejet.com/");
		 
		WebElement date=driver.findElement(By.xpath("//tbody/tr[3]/td[5]/a[text()='15']"));
		String dateValue="15/08/2019";
		
	}

	
}
