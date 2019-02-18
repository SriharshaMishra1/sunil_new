package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven_commondataProperties {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fobj = new FileReader(
				"./Data/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fobj);
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("password"));
		Thread.sleep(4000);

	}
}
