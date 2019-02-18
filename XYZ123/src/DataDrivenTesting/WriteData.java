package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data/testdatal.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet2");
		sh.getRow(1).createCell(4).setCellValue("my name is mishra");
		FileOutputStream fos=new FileOutputStream("./Data/testdatal.xlsx");
		wb.write(fos);
		wb.close();
}
}