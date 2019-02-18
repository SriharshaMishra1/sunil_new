package Com.actitime.customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplore {
	public static void main(String[] args) {
		System.setProperty("WebDriver.IE.driver","D:\\selenium\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.com/");

}
}