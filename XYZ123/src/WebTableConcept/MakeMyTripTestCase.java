package WebTableConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/*Write a program to navigate the tommts and enter the particular date from celander*/


	
	


	public class MakeMyTripTestCase {

		@Test
		public void displayCurrentSystemDateTest() {

			WebDriver driver = new FirefoxDriver();

			/* navigate to makemytrip */
			driver.get("https://www.makemytrip.com");

			/* goto depart click on it */
			driver.findElement(By.id("hp-widget__depart")).click();

			/* Now to use java script to handle ScrollBar */

			
			int monthCount = 0;

			while (monthCount<= 12) {

				try {
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					/* click 15-aug-2019 */
					driver.findElement(By.xpath("//tbody/tr[3]/td[4]/a[text()='15']")).click();
					/*
					 * if the above condition is satisfy then it will break the loop
					 * and it come out of the try block
					 */

					break;

				} catch (Throwable t) {

					/*
					 * if try block logic is not satisfy then we need to go for
					 * catch block until the condition is satisfy
					 */
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

					driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
					monthCount++;
				}

			}

			// driver.close();
		}
	}


