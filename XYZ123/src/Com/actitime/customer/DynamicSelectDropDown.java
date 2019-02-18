package Com.actitime.customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectDropDown {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	//open the image and collect the address those have given on addres bar:
	driver.get("file:///C:/Users/sriharsha/Desktop/dynamicdd.html");
	
	String str="Catxm";
	boolean flag=false;
	//check java is available or not in dropdown otherwise not Select
	//why it is saying dynamic drop down: might be added some data in future
	
	//identify the dynamic select dropdown
	WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
	Select sel=new Select(wb);
	List<WebElement>  list=sel.getOptions();
	//howmany element present in the dropdown:
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++)
	{
		  //capture element from the dropdown:
		String str1=list.get(i).getText();
		System.out.println(str1);
		
		//find the expected element from the drop down:
		if(str.equals(str1))
		{
			sel.selectByVisibleText(str);
			
			//select the option if available & break the loop
			flag=true;
			break;
		}
		
	}
	
  if(flag==true)
  {
	  System.out.println(str+"==>option is available");
  }
  else
  {
	  System.out.println(str+"==>option is not available");
  }
	
}
}
