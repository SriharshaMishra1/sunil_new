package DataDrivenTesting;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Call_Library_ExcelFileObject {
	public static void main(String[] args) throws Throwable {
		FileutilsEXCELsheet_Library  flib=new FileutilsEXCELsheet_Library ();
		 String data=flib.getExcelData( "sheet1",1, 2);
		 System.out.println(data);
		// WebDriver driver=new FirefoxDriver();
		 
		 
	
	}

}
