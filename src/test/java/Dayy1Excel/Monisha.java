package Dayy1Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Monisha {public static void main(String[] args) throws IOException {
	File l=new File("C:\\Users\\K.BALAJI\\eclipse-workspace\\Day1Excel\\Input\\Book1.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s=w.createSheet("TESTDATA");
		Row r=s.getRow(0);
        Cell c=r.getCell(0);
		c.setCellValue("Welcome");
		System.out.println(c);
	FileOutputStream f1=new FileOutputStream(l);
	w.write(f1);
	System.out.println("read done");
	
	
	
	
}
}



