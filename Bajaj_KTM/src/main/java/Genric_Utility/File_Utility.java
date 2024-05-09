package Genric_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {

	public String getpropertyvalue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Browser/KTM.txt");
		Properties pro=new Properties();
		pro.load(fis);

		String value = pro.getProperty(key);
		return value;
	}
}
