package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("sheet2");
		//outer loop for vary for rows---->01to1
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=4;j++ )
				//inner loop is vary for cell
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	

	}

}
