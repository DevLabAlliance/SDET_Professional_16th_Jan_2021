package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		String excelFile = "./data/tc001.xlsx";
		
		XSSFWorkbook wbook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNumber = sheet.getLastRowNum();
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println("Rows "+ lastRowNumber);
		
		int lastCellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println("Cols: "+lastCellNumber);
		for (int i =1; i <= lastRowNumber; i++) {
			XSSFRow row = sheet.getRow(i);
			String data;
			for (int j = 0; j < lastCellNumber; j++) {
				XSSFCell col = row.getCell(j);
				data = col.getStringCellValue();
				System.out.println(data);
			} 
		}
		
//		wbook.close();
	}

}
