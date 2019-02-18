package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_p2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//amazon Sign in:
		//driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[text()='Hello. Sign in']")).click();
		//amazon Sign in alt mtd
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[1]")).click();
	WebElement wb=	driver.findElement(By.xpath("//*[@name='email']"));
	wb.sendKeys("sriharshamishra.eee@gmail.com");
	driver.findElement(By.xpath("//div[@class='a-section']/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("8512027132");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='a-button-inner']/input[@id='signInSubmit']")).click(); 
	Thread.sleep(20000);
		WebElement wbc=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		wbc.sendKeys("iphone");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	String x="//h2[text()='Apple iPhone XR (Black, 3GB RAM, 128GB Storage, 12 MP Camera, 326 PPI Display)']/../../../../div[2]/div[1]/div/a/span[2]";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);

}
}
