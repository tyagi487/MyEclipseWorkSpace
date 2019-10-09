import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class PlzRead {
	
	String filepath;
	
  public PlzRead(String filepath){
		this.filepath=filepath;
	}
  
  public String readdata(String sheetname, int row , int cell) {
	  
	  String value=null;
	  
	  try {
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Cell cl=wb.getSheet(sheetname).getRow(row).getCell(cell);
		
		//***************************************************************************************************************************************//
	/*	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheetname);
		int RowCount=sh.getLastRowNum();
		for(int i=0; i<=RowCount; i++) {
			
			Row rw=sh.getRow(i);
			
			if(rw.getCell(0).toString().equalsIgnoreCase(null)) {
				int cellCount=rw.getLastCellNum();
				
				String[] data = new String[cellCount];
				
			}
			for(int j=0; j<data.length; j++) {
				
				org.apache.poi.ss.usermodel.Cell cll=rw.getCell(j);
				
			}
			
		}
		
		*/
		
		//***************************************************************************************************************************************//

		
		
		
		
		switch(cl.getCellType()) 
		{
		
		case STRING:
			value=cl.getStringCellValue();
			break;
			
		case BOOLEAN:
			value=Boolean.toString(cl.getBooleanCellValue());
		     break;
		
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cl)) {
				
				SimpleDateFormat sdf=new SimpleDateFormat("MM dd , yyyy");
				value=sdf.format(cl.getDateCellValue());
				
			}
			else {
				long longValue=(long)cl.getNumericCellValue();
				value=Long.toString(longValue);
				
			}
			
			break;
		
		default:
			System.out.println("Cell Format is not matching");
			break;
			
		}
		
	} 
	  
	  
	  catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} 
	  catch (EncryptedDocumentException e) {
		e.printStackTrace();
	}
	  
	  catch (IOException e) {
		e.printStackTrace();
	}
	  
	  
	  return value;
	  
  }
	

}
