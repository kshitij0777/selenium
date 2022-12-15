package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File  MyFile = new File("E:\\selenium\\Kshitij.xlsx");
		String value1 = WorkbookFactory.create(MyFile).getSheet("Kshitij").getRow(0).getCell(0).getStringCellValue();
         System.out.println(value1);
         

	}
}