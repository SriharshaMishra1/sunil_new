package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		//identify the dropdown menu
		WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
		//use Action class: coz we are control though mouse
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		//click on sub-menu:computers
		driver.findElement(By.xpath("//span[text()='Computers']")).click();
	}

}
