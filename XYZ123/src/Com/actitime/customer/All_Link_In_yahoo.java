package Com.actitime.customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Link_In_yahoo {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com");
		
		//identify all element 
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		System.out.println(list.size());
		for(WebElement wb:list)
		{
			String linkname=wb.getText();
			System.out.println(linkname);
		}
	}

}
