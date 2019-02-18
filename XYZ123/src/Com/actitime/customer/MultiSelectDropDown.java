package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	//xpath of dropdown menu
		WebElement wb=driver.findElement(By.xpath("//select[@name='cars']"));
		Select sel=new Select(wb);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("Saab");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		
		sel.deselectByIndex(0);
	}

}
