package bosch;

import java.io.FileInputStream;
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
	//generic reusable method
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh  =wb.getSheet(sheetName);
		Row rw=sh.getRow(rowCount);
		Cell cell= rw.getCell(cellCount);
		String data=cell.getStringCellValue();
		return data;

	}

	//generic reusable method to get the row count from excel file
	public int getRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rc=sh.getLastRowNum();
		return rc;


	}

	//generic reusable method to write the data in excel file

	public void writeDataExcel(String excelpath,String SheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook	wb=WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh=wb.getSheet(SheetName);//go to specified sheet
		Row rw=sh.getRow(rowCount);//go to the specified row
		Cell cell=rw.createCell(cellCount);//create cell
		cell.setCellValue(data);//send the data

		FileOutputStream fos = new FileOutputStream(excelpath);//specify path of excel file
		wb.write(fos);//write the data

	}

	public String readPropertyfile(String propPath,String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;


	}






}





