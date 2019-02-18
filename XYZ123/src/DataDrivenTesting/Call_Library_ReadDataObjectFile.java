package DataDrivenTesting;

public class Call_Library_ReadDataObjectFile {
	public static void main(String[] args) throws Throwable {
		 DataDriven_WriteExcelSheet_LIBRARY flib=
				 new  DataDriven_WriteExcelSheet_LIBRARY();
	    flib.WriteExcelData("sheet1", 4, 3, "DataDriven framework successful");
	
}
}