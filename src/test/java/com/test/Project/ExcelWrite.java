package com.test.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWrite {
	@Test
	public void writeIntoExcel() throws Exception {
		File f = new File("F:\\Exam\\Book1.xlsx");
		FileInputStream fr = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fr);
		Sheet sh = wb.getSheet("sheet3");
		Sheet sh = wb.getSheet("sheet2");
		int rowindex=5;
		int columnindex=7;
		Row row=sh.getRow(rowindex);
		if(row==null){
			sh.createRow(rowindex);
		}
		Cell cell=sh.getRow(rowindex).getCell(columnindex);
		if(cell==null){
			sh.getRow(rowindex).createCell(columnindex).setCellValue("Hello");
		}
		else{
			sh.getRow(rowindex).getCell(columnindex).setCellValue("Java");
		}
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		
	}
		
}
