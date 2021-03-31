package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Work {
	
	public static void main(String[] args) throws IOException {
		
	
	
	File file = new File("C:\\Users\\ashick\\eclipse-workspace\\selenium11.30\\TestDataXL\\Book2.xlsx");
	
	FileInputStream fin = new FileInputStream(file);
	
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet s = w.getSheet("Book2");
	
	Row r = s.getRow(1);
	
	Cell c = r.getCell(1);
	
	String value = c.getStringCellValue();
	
	if (value.contains("selenium")) {
		
		c.setCellValue("java");
		
	}
	
	
	FileOutputStream stream = new FileOutputStream(file);
	
	w.write(stream);
	
	System.out.println("done");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
