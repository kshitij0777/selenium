package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExecelEg1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		File  MyFile = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
		String value1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
         System.out.println(value1);
         
         File myfile1= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
        String value2 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
         System.out.println(value2);
         
         File myfile3= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
        double value3 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
          System.out.println(value3);
      
		
 		File  MyFiles = new File("E:\\selenium\\Kshitij\\myfile.xlsx");
 		String value11 = WorkbookFactory.create(MyFiles).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
          System.out.println(value11);
          
          File myfile12= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
         String value20 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
          System.out.println(value20);
          
          File myfile0= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
          String value00 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
           System.out.println(value00);
           
           File myfile07= new File("E:\\selenium\\Kshitij\\myfile.xlsx");
           String value07 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(2).getCell(2).getStringCellValue();
            System.out.println(value07);
         
       
           
	}

}
