package Com.crm.Products;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Selenium.ParallelExecution.BaseClass_PEX;

public class Create_Product extends BaseClass_PEX {
	@Test
	public void createproductsTest() throws Throwable {
		System.out.println("Execute Createcontact test");
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("tiger");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}

	@Test
	public void NewProductTest() {
		System.out.println("execute create Product");
	}

	@Test
	public void ModifyProductTest() {
		System.out.println("execute create ModifyProducttest");
	}

	@Test
	public void DeleteProductTest() {
		System.out.println("execute create DeleteProducttest");
	}

}
