package Com.actitime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		String username="admin";
		String password="manager";
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		//setting btn:
        //driver.findElement(By.xpath("//*[@class='menuTableWrap userProfileWithError']/tbody/tr[2]/td/div/div[1]/div/div[1]/div[2]")).click();
        /*alt setting btn*/
		//driver.findElement(By.xpath("//div[@class='popup_menu_icon settings_icon']/div]")).click();
       /* alt2 setting btn*/ 
       WebElement wb= driver.findElement(By.xpath("//tbody/tr[2]/td/div/div[1]/div/div[1]/div[2]"));
        wb.click();
        Thread.sleep(2000);
        //dropdown of setting select General Setting
        driver.findElement(By.xpath("//div[@class='item_title']/span")).click();
        Thread.sleep(1000);
        WebElement wb1=  driver.findElement(By.xpath("//*[@id='firstHierarchyLevelCodeSelect']"));
        wb1.click();
        Select sel=new Select(wb1);
        sel.selectByVisibleText("Product Line");
        Thread.sleep(1000);
        wb1.click();
       // sel.selectByIndex(3);
       // Thread.sleep(1000);
       // sel.selectByValue("2");
        

	}

}
