package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_operation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	WebElement wb=driver.findElement(By.linkText("Gmail"));
	Actions act=new Actions(driver);
	act.contextClick(wb).sendKeys("t").build().perform();
	
}
}
