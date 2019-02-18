package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Operation {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		Thread.sleep(7000);
		WebElement wb=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement wbc=driver.findElement(By.xpath("//*[@id='droptarget']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(wb, wbc).perform();
	}

}
