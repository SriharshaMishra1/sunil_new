package Com.actitime.customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
public class Program_2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Dimension d=new Dimension(100,300);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Today's")).click();
		driver.manage().deleteAllCookies();
	}

}
