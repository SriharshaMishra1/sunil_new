package Com.actitime.customer;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Operation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
	WebElement wwb=	driver.findElement(By.name("username"));
	wwb.sendKeys("admin");
	Actions act=new Actions(driver);
	act.doubleClick(wwb).perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
	Thread.sleep(7000);
	act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
	
	}

}
