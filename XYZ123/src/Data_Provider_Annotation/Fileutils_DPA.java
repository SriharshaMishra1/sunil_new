package Data_Provider_Annotation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fileutils_DPA {
		
	XSSFWorkbook wb;
	XSSFSheet sheet2;
	public Fileutils_DPA(String excelpath)
	{
		
		try
		{
			File src=new File(excelpath);
					FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int sheetNumber,int row,int column)
	{
		sheet2=wb.getSheetAt(sheetNumber);
		String data=sheet2.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	
	public int getRowCount(int sheetIndex)
	{
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	
}
