package Com.actitime.customer;



import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_programe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//amazon Sign in:
		//driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[text()='Hello. Sign in']")).click();
		//amazon Sign in alt mtd
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[1]")).click();
	WebElement wb=	driver.findElement(By.xpath("//*[@name='email']"));
	wb.sendKeys("sriharshamishra.eee@gmail.com");
	driver.findElement(By.xpath("//div[@class='a-section']/span[1]")).click();
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.xpath("//*[@id='ap_password']"));
	pass.sendKeys("8512027132");
	pass.sendKeys(Keys.ENTER);
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//span[@class='a-button-inner']/input[@id='signInSubmit']")).click(); 
	//Thread.sleep(2000);
		WebElement wbc=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		wbc.sendKeys("iphone 10");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	String str=	driver.findElement(By.xpath("//span[@id='s-result-count']")).getText();
	System.out.println(str);
	Thread.sleep(2000);
	String x1="//span[text()='4 GB & More']/../preceding-sibling::input";
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='128 GB']")).click();
	//driver.findElement(By.xpath("//span[contains(@class,'a-color-state ')]"));
	//Thread.sleep(100);
	driver.findElement(By.xpath(x1)).click();
	String result=driver.findElement(By.xpath("//span[@id='s-result-count']")).getText();
	System.out.println(result);
	String arr[]=result.split(" ");//0124567989
	
	/*if(arr[0].equals("1"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}*/
	System.out.println(Arrays.toString(arr));
	
	   driver.close();
	}

}
