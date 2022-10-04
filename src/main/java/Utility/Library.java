package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {
	
	static String filepath="C:\\\\Users\\\\Dell\\\\Desktop\\\\Visionfolder\\\\Batch13_Eve\\\\TestData\\\\Data.xlsx";

	
	public static String getExcelData(String filepath,String sheetname,int row,int cell) throws Exception {
		
		
	    // Object- FileinputSTream
	    FileInputStream fis=new FileInputStream(filepath);
	    
	    // Object -XSSFWorkbook
	    
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    
	    // data call
	    
	    String data1=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data1;
	    
	}
}
