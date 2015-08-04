package com.fileread;

import java.io.File;

import com.utils.ReadFromExcel;

public class ReadExcelFiles {

	public static void main(String [] args){
		
		ReadFromExcel excelReader = new ReadFromExcel("data"+File.separator+"DataSheet.xlsx", "DataTable1");
		
		Object[][] sheetData = excelReader.getSheetData();
		
		int rowCount = sheetData.length;
		
		for(int i=0; i<rowCount ; i++){
			
			int colCount = sheetData[i].length;
			
			for(int j=0; j<colCount ; j++){
				System.out.println( sheetData[i][j].toString());
			}
			
			System.out.println("************* END OF ROW "+i+" *************");
		}

		
	}	
}
