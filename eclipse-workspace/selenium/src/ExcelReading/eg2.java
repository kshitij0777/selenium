package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File  MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
		
		Workbook myWorkbook = WorkbookFactory.create(MyFile);
		  Sheet mysheet = myWorkbook.getSheet("sheet1");
		Row myRow = mySheet.getRow(0);
		
		  
		 Cell myCell = myRow.getCell(0);
		CellType celldataType = myCell.getCellType();
		System.out.println(celldataType);
		 
		  
		  
		
		
		
		
	}

}
