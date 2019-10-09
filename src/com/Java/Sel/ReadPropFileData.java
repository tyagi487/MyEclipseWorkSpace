package com.Java.Sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFileData {

	public static void main(String[] args) throws IOException {
		
	
	File file=new File("./Akash.txt");
	
	FileInputStream fis=new FileInputStream(file);
	Properties p=new Properties();
	p.load(fis);
	
	System.out.println(p.getProperty("Driver"));
	
	
}
}