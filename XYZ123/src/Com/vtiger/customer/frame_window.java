package Com.vtiger.customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_window {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sriharsha/Desktop/iframe.html");
		//driver.switchTo().frame("Third");
		//driver.switchTo().frame(1);
		//WebElement wb=driver.findElement(By.xpath("//iframe[@id='Third']"));
		//driver.switchTo().frame(wb);
		
		List<WebElement> element1=driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of ifame is:"+element1.size());
		Thread.sleep(4000);
		/*driver.findElement(By.xpath("//a[text()='Projects']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("click here for selenium tutorial")).click();*/
		driver.close();
	}

}
