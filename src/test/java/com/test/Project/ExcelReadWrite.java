package com.test.Project;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.*;
@Test
public class ExcelReadWrite {

	public void readFromExcel() throws Exception {
		File f = new File("F:\\Exam\\Book1.xlsx");
		FileInputStream fr = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fr);
		Sheet sh = wb.getSheet("sheet1");
		Cell data = sh.getRow(2).getCell(3);
		if (data.getCellType() == 0) {
			System.out.println(data.getNumericCellValue());
		} else if (data.getCellType() == 1) {
			System.out.println(data.getStringCellValue());
		}

	}

}
