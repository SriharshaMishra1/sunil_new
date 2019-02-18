package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileutils_LIbrary {
String filepath="./Data/commondata.properties";
public Properties getpropertyobject() throws Throwable
{
	FileInputStream fis=new FileInputStream(filepath);
	Properties pobj=new Properties();
	pobj.load(fis);
	return pobj;
	
}
}
