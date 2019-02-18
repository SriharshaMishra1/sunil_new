package Com.actitime.customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown_Own {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sriharsha/Desktop/new%20multiple.html");
		//xpath of dropdown menu
				WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
				wb.click();
				Select sel= new Select(wb);
				sel.selectByIndex(3);
				Thread.sleep(500);
				sel.selectByVisibleText("india");
				Thread.sleep(500);
		    sel.deselectByIndex(3);
			Thread.sleep(1000);
		    sel.deselectByVisibleText("india");
		  boolean b=  sel.isMultiple();
		  if(b)
		  {
			  //select all the option from the Dropdown
			  for(int i=0;i<=3;i++)
			  {
				  sel.selectByIndex(i);
			  }
		  }
		  else
		  {
			  System.out.println("it's not a multiple dropdown");
		  }
		  Thread.sleep(2000);
		  sel.deselectAll();
		  Thread.sleep(2000);
		  
		List<WebElement> alldropdown =sel.getAllSelectedOptions();
		for(WebElement webElement : alldropdown)
		{
			System.out.println("all drop dowon from list="+ webElement.getText() );
		}
		
		List<WebElement>newdd=sel.getOptions();
		for(WebElement webElement1 :newdd)
		{
			System.out.println("all newdd = "+webElement1.getText());
		}
		}
		
				
	

}

