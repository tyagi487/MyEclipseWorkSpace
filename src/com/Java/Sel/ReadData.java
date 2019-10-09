package com.Java.Sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
File file= new File("C:\\Users\\akash.tyagi\\Desktop\\AdvancData.xlsx");
FileInputStream fis= new FileInputStream(file);
Workbook wb = WorkbookFactory.create(fis);
Cell data = wb.getSheet("Sheet1").getRow(1).getCell(1);
System.out.println(data);


}
}