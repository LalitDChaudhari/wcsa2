package handleExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready fo read operation
		Sheet sh = wb.getSheet("CityTour");//go to specified sheet
		Row rw = sh.getRow(4);//go to the specified row
		
		Cell cell = rw.createCell(4);
		cell.setCellValue("automation");
		
		FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);

	}

}
