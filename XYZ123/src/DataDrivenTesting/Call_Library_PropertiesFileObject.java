package DataDrivenTesting;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Call_Library_PropertiesFileObject {
public static void main(String[] args) throws Throwable {
	Fileutils_LIbrary flib=new Fileutils_LIbrary();
	Properties pobj=flib.getpropertyobject();
	String url=pobj.getProperty("url");
	String un=pobj.getProperty("username");
	String pwd=pobj.getProperty("password");
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
	driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("username"));
	driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("password"));
	
}
}
