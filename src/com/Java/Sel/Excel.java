package com.Java.Sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {

	static int i;
	static int j;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file= new File("C:\\\\Users\\\\akash.tyagi\\\\Desktop\\\\AdvancData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		
		
//		Cell data = wb.getSheet("Sheet1").getRow(1).getCell(3);
//		System.out.println("Data is"+" "+data);
		
		Sheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getLastRowNum();
	System.out.println(rowcount);
	
	for(i=1; i<=rowcount;i++) {
		
		
		short cellcount = sh.getRow(i).getLastCellNum();
		System.out.println(cellcount);
		
		for(j=0; j<cellcount; j++) {
			
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
			
		}
		
	}
	
//		
//		short cellcount = sh.getRow(1).getLastCellNum();
//		System.out.println(cellcount);
//		
		
		
		
		
	
		
		
	}
}
