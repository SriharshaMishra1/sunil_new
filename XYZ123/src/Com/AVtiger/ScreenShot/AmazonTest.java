package Com.AVtiger.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public void AmazonError() throws Throwable
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
	File srcfile=eDriver.getScreenshotAs(OutputType.FILE);
	File dfile=new File(System.getProperty("user.dir")+"\\screenshot\\test.png");
	File  dfile1=new File(".\\screenshot\\test.png");
	FileUtils.copyFile(srcfile, dfile1);

}
}