/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet 
{

	private static final String STRING = null;
	String filepath;
	
	public ReadExcelSheet()  // to call writeData()
	{
		
	}
	public ReadExcelSheet(String filepath)  // to call readData()
	{
		this.filepath=filepath;
	}
	public String[] readData(String sheetName, String testcaseID, String dateFormat)
	{
		 String[] data = null;
		
		try {
			FileInputStream fis=new FileInputStream(new File(filepath));
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rowCount = sh.getLastRowNum();
			
			for(int i=0; i<=rowCount; i++)
			{
				Row rw = sh.getRow(i);
				
				if(rw.getCell(0).toString().equalsIgnoreCase(testcaseID))
				{
					int cellCount=rw.getLastCellNum();
					data = new String[cellCount];
					
					for(int j=0; j<data.length;j++)
					{
						 Cell cl = rw.getCell(j);
						
					
					switch (cl.getCellType()) {
					case STRING:
						data[j] =cl.getStringCellValue();
						break;
						
	               case NUMERIC:
						if(DateUtil.isCellDateFormatted(cl))
						{
							SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
							data[j]= sdf.format(cl.getDateCellValue());
						}
						else {
						 long longValue=(long)cl.getNumericCellValue();
						data[j]= Long.toString(longValue);
						
						 
						}
						break;

	              case BOOLEAN:
	            	 data[j]= Boolean.toString(cl.getBooleanCellValue());
		
		          break;
	             default:
	            	 System.out.println("Cell format is not mmatching");
						break;
					}// end of switch
				} // end of cell loop
				break;
			}// end of if statement
			
		}// end of row loop 
		}
		 catch(EncryptedDocumentException | IOException  e)
		 {
			 e.printStackTrace();
		 }
		return data;
	}*/
	