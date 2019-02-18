package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven_ExcelSheet_Library {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./Data/testdatal.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	Row row=sh.getRow(1);
	Cell cel=row.getCell(2);
	String data=cel.getStringCellValue();
	System.out.println(data);
	wb.close();
	String data1=sh.getRow(2).getCell(2).getStringCellValue();
	System.out.println(data1);
}

public int getRowcount(String SheetName) {
	return 0;
}

public String getExcelData(String string, int i, int j) {
	return null;
}
}
