package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("localhost:8888");
WebElement wb=	driver.findElement(By.xpath("//input[@id='username']"));wb.sendKeys("admin");;
Actions act=new Actions(driver);
act.doubleClick(wb).perform();;
}
}
