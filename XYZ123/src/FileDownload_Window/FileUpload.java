package FileDownload_Window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount");
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		driver.findElement(By.xpath("//input[@name='uploadCV']")).click();
		StringSelection path=new StringSelection("C:\\Users\\sriharsha\\Desktop\\Sriharsha Mishra_3 years_exp.manual_automation_testing.docx");
		Toolkit t=Toolkit.getDefaultToolkit();
		Clipboard c=t.getSystemClipboard();
		c.setContents(path, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public class WebDriverUtils {
	public void uploadfile(String localpath) throws AWTException, Throwable
	{	
	StringSelection path=new StringSelection(localpath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);                  
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
				
}
}
