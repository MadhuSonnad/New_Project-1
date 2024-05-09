package Genric_Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {

	public String getdatafromExcel(String sheetname, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Excel/Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		org.apache.poi.ss.usermodel.Cell cell=row.getCell(cellnum);
		String data = cell.getStringCellValue();
		return data;
	}
}
