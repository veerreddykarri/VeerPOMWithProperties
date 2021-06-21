package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelData(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rows = ws.getLastRowNum(); 
		int cells = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rows][cells];
				
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cells; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
			}
				
		}
		//to close the workbook
		wb.close();
		return data;
	}
}
