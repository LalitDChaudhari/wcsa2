package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//read data from excel file
	public String readExcelData(String excelPath,String sheetName,int cellCount,int rowCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rc = sh.getRow(rowCount);
		Cell cell = rc.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	// get row count in excel file
	public int getRowCount (String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	//write the data in excel file
	public void writeExcelData(String excelPath,String sheetName,int cellCount,int rowCount,String data) throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis = new FileInputStream(excelPath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(sheetName);
	  Row rc = sh.getRow(rowCount);
	  Cell cell = rc.createCell(cellCount);
	  cell.setCellValue(data);
	  
	  FileOutputStream fos = new FileOutputStream(excelPath);
	  wb.write(fos);
	  
		
	}

      //read the data from property file
	public String readPropertyFile(String excelPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
		
	}
	
}
