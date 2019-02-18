package FileDownload_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FiledownLoad {
public static void main(String[] args) {
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.download.folderList", 2);
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	profile.setPreference("browser.download.dir", "D:\\com\\");
	WebDriver driver=new FirefoxDriver(profile);
	driver.get("https:maven.apache.org/download.cgi");
	driver.findElement(By.linkText("apache-maven-3.6.0-bin.zip")).click();
}
}
