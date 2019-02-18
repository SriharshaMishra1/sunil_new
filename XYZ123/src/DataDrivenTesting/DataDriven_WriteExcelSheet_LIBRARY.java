package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven_WriteExcelSheet_LIBRARY {
	String excelpath="./Data/testdatal.xlsx";
	public void WriteExcelData(String SheetName,int rowName,
			int ColumnName,String Data) throws Throwable {
		
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		sh.getRow(rowName).createCell(ColumnName).setCellValue(Data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
	}

}
