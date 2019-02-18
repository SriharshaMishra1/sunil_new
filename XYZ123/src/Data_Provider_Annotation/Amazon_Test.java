package Data_Provider_Annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.DataDriven_ExcelSheet_Library;

public class Amazon_Test {
@Test
	@DataProvider
	public Object[][] getdata() throws Throwable
	{
		 DataDriven_ExcelSheet_Library flib=new  DataDriven_ExcelSheet_Library();
		int rowcount=flib.getRowcount("sheet1");
		Object[][] objArr=new Object[rowcount][3];
		for(int i=0;i<rowcount;i++)
		{
			objArr[i][0]=flib.getExcelData("sheet1", i, 0);
			objArr[i][1]=flib.getExcelData("sheet1", i, 1);
			objArr[i][2]=flib.getExcelData("sheet1", i, 2);
		}
		
		return objArr ;
		
		
	}
	

}
