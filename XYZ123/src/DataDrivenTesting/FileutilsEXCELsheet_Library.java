package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileutilsEXCELsheet_Library {
String excelpath="./Data/testdatal.xlsx";
public String getExcelData(String SheetName,int rowNum,int CelNum) throws Throwable {
	FileInputStream fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(SheetName);
	String data=sh.getRow(rowNum).getCell(CelNum).getStringCellValue();
	wb.close();
	return data;
	
}

}



