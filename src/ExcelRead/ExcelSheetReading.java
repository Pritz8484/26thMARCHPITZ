package ExcelRead;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException; import org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.CellType; import org.apache.poi.ss.usermodel.Sheet; import org.apache.poi.ss.usermodel.Workbook; import org.apache.poi.ss.usermodel.WorkbookFactory; 


public class ExcelSheetReading {

	 public static void main(String[] args) throws EncryptedDocumentException, IOException 
	 	{ 
	 	 	File myFile=new File("F:\\book1.xlsx"); 
	 	 	 
	 	 	Workbook myworkbook = WorkbookFactory.create(myFile); 
	 	 	Sheet mySheet = myworkbook.getSheet("Sheet1"); 
	 	 
	 	 	//-->1st element row & cell index find: 
	 	 	  
	 	 	int firstRowIndex = mySheet.getFirstRowNum();  	 
	 	 	System.out.println("First Row Index :"+firstRowIndex); 
	 	 	 
	 	 	short firstCellIndex = mySheet.getRow(firstRowIndex).getFirstCellNum(); 
	 	 	System.out.println("First Cell Index :"+firstCellIndex); 
	 	 	int FCell = firstCellIndex-1; 
	 	 	 
	 	 	//-->last element row & cell: 
	 	 	 
	 	 	int lastRowIndex = mySheet.getLastRowNum();  	
	 	 	System.out.println("Last Row Index :"+lastRowIndex); 
	 	 	 
	 	 	short lastCellIndex = mySheet.getRow(lastRowIndex).getLastCellNum(); 
	 	 	System.out.println("Last Cell Index :"+lastCellIndex); 
	 	 	int LCell = lastCellIndex-1; 
	 	 	 
	 	 	 
	 	 	 
	 	 	 
	 	 	for(int i=firstRowIndex;i<=lastRowIndex;i++) 
	 	 	{ 
	 	 	 	for(int j=FCell;j<=LCell;j++) 
	 	 	 	{ 
	 	 	 		Cell myCell = mySheet.getRow(i).getCell(j); 
	 	 	 	 	
	 	 	 	 	if(myCell!=null) 
	 	 	 	 	{ 
	 	 	 	 		
	 	 	 	 	 	CellType mycellDataType = myCell.getCellType();  	
	 	 	 	 	 	
	 	 	 	 	 	if(mycellDataType==CellType.STRING) 
	 	 	 	 	 	{ 
	 	 	 	 	 		System.out.print(myCell.getStringCellValue()+" "); 
	 	 	 	 	 	 
	 	 	 	 	 	} 
	 	 	 	 	 	else if (mycellDataType==CellType.BOOLEAN) 
	 	 	 	 	 	{ 
	 	 	 	 	 		System.out.print(myCell.getBooleanCellValue()+" "); 
	 	 	 	 	 	} 
	 	 	 	 	 	else if(mycellDataType==CellType.NUMERIC) 
	 	 	 	 	 	{ 
	 	 	 	 	 		System.out.print(myCell.getNumericCellValue()+" "); 
	 	 	 	 	 	} 
	 	 	 	 	} 
	 	 	 	 	else 
	 	 	 	 	{ 
	 	 	 	 	 	System.out.print(" "); 
	 	 	 	 	} 
	 	 	 	 	 
	 	 	 	} 
	 	 	 	System.out.println(); 
	 	 	} 
	 	 	 
	 	 	/*for(int i=2;i<=3;i++) 
	 	 	{ 
	 	 	 	for(int j=1;j<=4;j++) 
	 	 	 	{ 
	 	 	 
	 				System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+" "); 
	 	 	 	} 
	 	 	 	System.out.println(); 
	 	 	 	 
	 	 	}*/ 
	 	 	 
	 	 	 
	 	 	 
	 	 	 
	 	} 
	 
	} 
	 

	
