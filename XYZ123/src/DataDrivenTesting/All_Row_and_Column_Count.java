package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Row_and_Column_Count {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data/testdatal.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet3");
		int rowcount=sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			String col_0=sh.getRow(i).getCell(0).getStringCellValue();
			String col_1=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(col_0+"\t"+" "+col_1);
			System.out.println("Total_Row is"+" "+rowcount);
			break;
		}
	}

}
