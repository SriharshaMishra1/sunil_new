package FileDownload_Window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class WebDriverUtils_LIBRARY {
	public static void uploadfile(String localpath) throws AWTException, Throwable
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


