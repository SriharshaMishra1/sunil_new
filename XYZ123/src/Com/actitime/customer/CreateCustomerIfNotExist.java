package Com.actitime.customer;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCustomerIfNotExist {
	public static void main(String[] args) throws InterruptedException {
		
		String username="admin";
		String password="manager";
		String customer="ICICI0";
		boolean flag=false;
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);;
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='TASKS']")).click();
		driver.findElement(By.xpath("//*[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.xpath("//*[@name='selectedCustomer']"));
		Select sel=new Select(wb);
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++)
		{
			String str=list.get(i).getText(); 
			System.out.println(str);
			
			if(customer.equals(str))
			{
				sel.selectByVisibleText(customer);
				System.out.println(customer);
				flag =true;
				break;
			}
		}
	if(flag==true)
	{
		System.out.println(customer+"==>exist");
	}
	else
	{
		System.out.println(customer+"==> does not exist");
	}
	WebElement wbb=driver.findElement(By.xpath("//div[@id='ext-gen6']/div[1]/div/span"));
	    wbb.click();
	    Thread.sleep(2000);
	   /* driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys(customer);
	   WebElement wbc= driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div[1]/span"));
	    wbc.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).clear();  */
	   for(int i=0;i<list.size();i++)
	   {
		   Random num=new Random();
		   String customer1="ICICI"+num.nextInt(20);
		   driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys(customer1);
		   WebElement wbc= driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div[1]/span"));i++;
		   wbc.click();
		    Thread.sleep(3000);
		    //driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).clear();
		   
		    
		    WebElement a= driver.findElement(By.xpath(".//*[@id='customerLightBox_nameDuplicateError']"));
		    String str3=a.getCssValue("color");
		    //System.out.println(str3);
		   String str4="rgba(226, 73, 52, 1)";
		   if(str3.equals(str4))
			{
				System.out.println("red color verified");
			}
			else
			{
				System.out.println("red color is not verified");
			}
		    
		    i++;
		    
		    driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).clear();
		    
		    //rahul technology
		   /* int i=0;
			while(i< 5) {
				 Random num=new Random();
				  String cusname="ICICI"+num.nextInt(25);
    			 driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).clear();Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).sendKeys(cusname);
    	    	driver.findElement(By.xpath(".//*[@id='customerLightBox_commitBtn']")).click();i++; */
		 
	   }
	   //green clr
			WebElement wvb= driver.findElement(By.xpath("//span[@class='successmsg']"));
			String str2=wvb.getCssValue("color");
			System.out.println(str2);
			
	}

}
