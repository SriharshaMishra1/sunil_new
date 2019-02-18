package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestEditBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	WebElement wb=driver.findElement(By.name("q"));wb.sendKeys("wipro jobs");
	//Actions act=new Actions(driver);
	//act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//b[text()=' in bangalore']"));
	driver.findElement(By.xpath("//div[@class='VlcLAe']/center/input[@name='btnK']")).click();
}
}
