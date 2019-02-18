package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Chrome {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Selenium_new123/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
		.sendKeys("iphone",Keys.ENTER);
	}

}

