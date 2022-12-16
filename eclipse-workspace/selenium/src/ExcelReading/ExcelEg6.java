package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet4");
		int totalNumberOfRows = mySheet.getLastRowNum();
		int totalNumberOfcell = mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalNumberOfRows;i++)
		{
			
			for(int j=0;j<=totalNumberOfcell;j++)
			{
				 CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
				 if (cellDataType==CellType.STRING)
				 {
					  String stringValue = mySheet.getRow(i).getCell(j).getStringCellValue();
					  System.out.println(stringValue+" ");
				 }
				 else if (cellDataType==CellType.NUMERIC)
				 {
					 double Value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					 System.out.println(Value+" ");
				 }
				 else if(cellDataType==CellType.BOOLEAN)
				 {
					boolean Value = mySheet.getRow(j).getCell(j).getBooleanCellValue();
					 System.out.println(Value+" ");
				 }
				 else if(cellDataType==CellType.BLANK)
				 {
					 
				 }
				 
				 }
			      System.out.println();
			
		    }
		
		}
		
		
	}
		

	



