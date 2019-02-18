package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	String filepath="./Data/commondata.properties";
	public Properties getpropertyobject() throws Throwable
	{
		FileInputStream fis=new FileInputStream(filepath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
		
	}
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
