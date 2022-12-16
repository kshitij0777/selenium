package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet3");
		
	      int lastRowNum = mySheet.getLastRowNum();
	      System.out.println("last row no is"+lastRowNum);
	      
		int totalNumOfRows = lastRowNum;
		System.out.println("total number of rows are"+totalNumOfRows);
		
		
		short firstcellnumber = mySheet.getRow(0).getFirstCellNum();
		System.out.println("1st cell number is"+firstcellnumber);
		
		short lastcellnumber = mySheet.getRow(0).getLastCellNum();
		System.out.println("last cell number is"+lastcellnumber);
	
		int totalNoOfCell = lastcellnumber-1;
		System.out.println("total cell is"+totalNoOfCell);
		System.out.println("================================================================");
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNoOfCell;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
	}

}
