package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet5");
		//System.out.println(mySheet);
		System.out.println("================================================================");
		// How to read Single row in Excel sheet
		for(int i=0;i<=2;i++)
		{
			String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(myValue+"  ");
			
		}
		System.out.println();
		System.out.println("===============================================================");
		// How to read Single column/cell in Excel sheet
		for(int i=0;i<=4;i++)
		{
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
		System.out.println();
		System.out.println("==============================================");
		
	}

}
