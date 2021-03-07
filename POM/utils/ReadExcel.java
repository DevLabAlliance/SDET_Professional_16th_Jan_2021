package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] getData(String excelFile) throws IOException {
//		String excelFile = "./data/tc001.xlsx";
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelFile+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNumber = sheet.getLastRowNum();
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println("Rows "+ lastRowNumber);
		int lastCellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println("Cols: "+lastCellNumber);
		String[][] storeInExcel = new String[lastRowNumber][lastCellNumber];
		for (int i =1; i <= lastRowNumber; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNumber; j++) {
				XSSFCell col = row.getCell(j);
				String data = col.getStringCellValue();
				storeInExcel[i-1][j] =  data;
//				System.out.println(data);
			} 
		}
		return storeInExcel;
		
//		wbook.close();
	}

}
